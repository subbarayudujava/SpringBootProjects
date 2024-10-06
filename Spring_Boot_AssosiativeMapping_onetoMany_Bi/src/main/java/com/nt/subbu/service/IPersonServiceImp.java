package com.nt.subbu.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.subbu.entity.Person;
import com.nt.subbu.entity.PhoneNumbers;
import com.nt.subbu.repository.IPersonRepository;
import com.nt.subbu.repository.IPhoneNumber;

@Service
public class IPersonServiceImp implements IPersonMGmService {
	@Autowired
	private IPersonRepository iPersonRepository;
	@Autowired
	private IPhoneNumber iPhoneNumber;

	@Override
	public String saveDataUsingPerson(Person per) {

		return " Save the person Phone Numbers with:" + iPersonRepository.save(per) + "id values";
	}

	@Override
	public String saveDataUsingPhoneNumbers(Set<PhoneNumbers> phoneset) {
		/*List<String> msg=new ArrayList();
		if(phoneset.size()>0) {
			for(PhoneNumbers ph:phoneset) {
				return "phone Numbers mapped with person are save:"+iPhoneNumber.save(ph)+" phonenumbers";
			}
		}
		return msg.toString();*///another way below
		int count = iPhoneNumber.saveAll(phoneset).size();
		return count + "NO OF PHONE NUMBERS ID MAPPIED";
	}//method

	@Override
	public Iterable<Person> loadDataUsingParent() {
		Iterable<Person> it = iPersonRepository.findAll();
		return it;
	}//method

	@Override
	public Iterable<PhoneNumbers> loadDataUsingchild() {

		return iPhoneNumber.findAll();
	}//method

	@Override
	public String deletePersonData(Integer pid) {
		Optional<Person> opt = iPersonRepository.findById(pid);
		if (opt.isEmpty()) { 
			return "person details";
		} else {

			
			Person per = opt.get();
			iPersonRepository.delete(per);
			return pid + "delete the data :";
		} //method
	}

	@Override
	public String deleteAllData(List<Integer> regno) {
	List<PhoneNumbers> opp=	iPhoneNumber.findAllById(regno);
	if(opp.size()==0) {
		return"Data is not found";
	}else
		iPhoneNumber.deleteAll(opp);
		return opp.size()+"Data Delete";
	}// method close
	@Override
	public String deleteAllPhoneNumbers(Integer pid) {
	   Optional<PhoneNumbers> op1= iPhoneNumber.findById(pid);
	   if(op1.isEmpty()) {
		   return "data Is not Found";
	   }else {
		   int count=iPhoneNumber.deleteAllPhonesFromTheTable(pid);
		return count+"Data had deleted in the table";
	   }
	}//method
	@Override
	public List<Object[]> getDataFromTableByUsingJoins() {
		
		return iPersonRepository.fechDatausingJoinsByParents();
	}
}//class
