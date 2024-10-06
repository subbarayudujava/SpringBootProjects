package com.nt.subbu.runners;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.subbu.entity.Person;
import com.nt.subbu.service.IPersonMGmService;

@Component
public class AssosiationMappingTestRunners implements CommandLineRunner {
	@Autowired
	private IPersonMGmService Servic;

	@Override
	public void run(String... args) throws Exception {
		//save object operation(parent to child)one to many
		/*Person person = new Person();
		person.setPName("Subbarayudu");
		person.setPAddrace("hyd");
		
		PhoneNumbers numbers = new PhoneNumbers();
		numbers.setNumber_Type("compony");
		numbers.setPhoneNo(99999999l);
		numbers.setProvider("vi");
		
		PhoneNumbers phone = new PhoneNumbers();
		phone.setNumber_Type("residence");
		phone.setPhoneNo(88888888l);
		phone.setProvider("jio");
		//map object(parent to child and child to parent)
		
		numbers.setPerson(person);//child to parent(many to one)
		numbers.setPerson(person);
		 
		Set<PhoneNumbers> ph= Set.of(numbers,phone);
		person.setPhones(ph);//parent to child (one to may)
		  
		try {
		System.out.print(Servic.saveDataUsingPerson(ph)) ;
		} catch (Exception e) {
		e.getMessage();
		}*/

		//save object operation( child to parent)
		/*Person person = new Person();
		person.setPName("Subbarayudu");
		person.setPAddrace("hyd");
		
		PhoneNumbers numbers = new PhoneNumbers();
		numbers.setNumber_Type("compony");
		numbers.setPhoneNo(99999999l);
		numbers.setProvider("vi");
		
		PhoneNumbers phone = new PhoneNumbers();
		phone.setNumber_Type("residence");
		phone.setPhoneNo(88888888l);
		phone.setProvider("jio");
		//map object(parent to child and child to parent)
		
		numbers.setPerson(person);//child to parent(many to one)
		numbers.setPerson(person);
		 
		Set<PhoneNumbers> ph= Set.of(numbers,phone);//if incare mutable collection error will be raise the use below lines
		Set<PhoneNumbers> ph =new HashSet();
		ph.add(phone);
		ph.add(numbers);
		person.setPhones(ph);//parent to child (one to may)
		  
		try {
			System.out.print(Servic.saveDataUsingPhoneNumbers(ph));
		} catch (Exception e) {
			e.printStackTrace();
		}
		  */
		//parent retrive

		/*Servic.loadDataUsingParent().forEach(per->{
			System.out.println("person::"+per);
		
		Set<PhoneNumbers> chil=per.getPhones();
		chil.forEach(ph->{
			System.out.print("child"+ph);
		});
		System.out.print("-------");
		});*/

		//chilrd retrive
		Servic.loadDataUsingchild().forEach(ph -> {
			//get Assosiation parent
			System.out.print("child" + ph);
			Person person = ph.getPerson();
			
			System.out.print("chiled:"+person);
		});
		/*System.out.print(Servic.deletePersonData(1000));            //delete single row of parent to chiled
		System.out.print(Servic.deleteAllData(List.of(26,28)));*/   //deleting  maulti row using chiled to parent
		
		//System.out.println(Servic.deleteAllPhoneNumbers(1000));    // remove all phone numbers of the person byb pid 
		
		Servic.getDataFromTableByUsingJoins().forEach(row->{
			for(Object om:row) {
				System.out.print(om+" ");
			}
		});
	}//runners

}//class
