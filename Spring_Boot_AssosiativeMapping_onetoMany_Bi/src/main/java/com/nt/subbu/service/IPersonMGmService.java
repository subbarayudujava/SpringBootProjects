package com.nt.subbu.service;

import java.util.List;
import java.util.Set;

import com.nt.subbu.entity.Person;
import com.nt.subbu.entity.PhoneNumbers;

public interface IPersonMGmService {
	public String saveDataUsingPerson(Person per);

	public String saveDataUsingPhoneNumbers(Set<PhoneNumbers> phoneset);

	public Iterable<Person> loadDataUsingParent();

	public Iterable<PhoneNumbers> loadDataUsingchild();

	public String deletePersonData(Integer pid);//parent to chiled deletion

	public String deleteAllData(List<Integer> regno);//chiled to parent deletion
	
	public String deleteAllPhoneNumbers(Integer pid);
	
	public List<Object[]> getDataFromTableByUsingJoins();
}
