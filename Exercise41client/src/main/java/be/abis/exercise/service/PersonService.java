package be.abis.exercise.service;

import be.abis.exercise.model.Person;

import java.util.List;

public interface PersonService {
	
	    List<Person> getAllPersons();
	    Person findPerson(int id) throws Exception;
	    Person findPerson(String emailAddress, String passWord) throws Exception;
	    List<Person> findPersonsByCompanyName(String compName);
	    void addPerson(Person p);
	    void deletePerson(int id);
	    void changePassword(Person p);
	    void changePassword(int id,String newpwd);
}
