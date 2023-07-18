  package com.example.jpacustomRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer>
{
/*	Custom Methods :
		While Creating custom methods we must be more specific in defining methods
		Name must be like a index of a face
		it must explain what we want to achieve 
		Rest will be taken care of by framework */
	
//	1. 
	public Iterable<Person> findAllByFirstName(String firstName);
	
//	2. 
	public Iterable<Person> findAllByLastName(String lastName);
	
//	3.
	public Iterable<Person> findAllByAge(Integer age);
	
//	4.
	public Person findByEmail(String email);
	
//	5.
	public Iterable<Person> findAllByAgeGreaterThan(Integer age);
	
//	6.
	public Iterable<Person> findAllByAgeLessThan(Integer age);
	
//	7.
	public Iterable<Person> findAllByFirstNameOrLastName(String firstName, String lastName);
	
//	8.
	public Iterable<Person> findAllByFirstNameAndLastName(String firstName , String lastName);
	
//	9.
	public Iterable<Person> findAllByFirstNameLike(String firstName);
	
//	10.
	public Iterable<Person> findAllByLastNameLike(String lastName);
	
	
//	Custom Queries(JQL)
//	point to remember :
//		in JQL Attribute name in place of Column name
//		and Entity class name in place of Table name 
	
//	1. All the records
	@Query("from Person")
	public Iterable<Person> query1();
	
//	2. returns Only FirstName
	@Query("select firstName from Person")
	public Iterable<String> query2();
	
//	3. returns email 
	@Query("select email from Person")
	public Iterable<String> query3();

//	4. returns firstName and lastName
	@Query("select firstName, lastName from Person")
	public Iterable<String[]> query4();
		
//	5.
	@Query("select firstName, age from Person")
	public Iterable<Object[]> query5();

//	where condition
	
//	6. 
	@Query("from Person p where p.email =:email")
	public Person query6(String email);
	
//	7.
	@Query("from Person p where p.aadharNum = ?1")
	public Person query7(Integer aadharNum);
	
//	8.
	@Query("from Person p where p.firstName=?1 And p.email=?2")
	public Person query8(String firstName, String email);
	
//	9.
	@Query("select aadharNum from Person p where p.email = ?1 And p.age = ?2")
	public Integer query9(String email, Integer age);
	
//	10.
	@Query("select firstName from Person p where p.age <= ?1")
	public Iterable<String> query10(Integer age);
	
//	Native SQL Query
//	Incorporating SQL queries into JQL
//	No need to use Attributes in the place of Column and EntityClass in place Of Table
	
//	1.
	@Query(value="select * from person", nativeQuery = true)
	public Iterable<Person> nativeQuery1();
	
//	2.
	@Query(value="select first_name, last_name from person", nativeQuery = true)
	public Iterable<String[]> nativeQuery2();
	
//	3.
	@Query(value="select first_name from person where age =: arg", nativeQuery = true)
	public Iterable<String> nativeQuery3(Integer arg);
	
//	4.
	@Query(value="select first_name from person where gender=?1", nativeQuery = true)
	public Iterable<String> nativeQuery4(String gender);
	
//	5.
	@Query(value="select email from person where first_Name = ?1 and last_Name = ?2 and age = ?3", nativeQuery = true )
	public Iterable<Integer> nativeQuery5(String firstname, String lastName, Integer age);
}