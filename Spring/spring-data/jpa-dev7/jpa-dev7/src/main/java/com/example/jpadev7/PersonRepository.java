package com.example.jpadev7;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> 
{
//	customizing repository based on our requirements in addition to built in methods
//	We don't need to take care of implementation since Framework will auto implement the method
//	But here we must be specific in details providing in the abstract method
//	attribute name must match the method name
	
//	public Iterable<Person> findByFirstName(String firstName); used for unique column (there may be multiple persons with same name)
	public Iterable<Person> findAllByFirstName(String firstName);
	
	public Iterable<Person> findAllByLastName(String lastName);
	
	public Iterable<Person> findAllByAge(Integer age);
	
	
//	email column is unique so there will be only one record so we need to specify findBy instead of findAllBy
//	since there will be one record for any specified value
	
	public Person findByEmail(String email);
	
//	function to find a record based on firstName or lastName
	public Iterable<Person> findAllByFirstNameOrLastName(String firstName, String lastName);
	
//	function to find a person record where both firstName & lastName matches strictly
	public Iterable<Person> findAllByFirstNameAndLastName(String firstName, String lastName);
	
//	function to find records based on similar matches in firstName
	public Iterable<Person> findAllByFirstNameLike(String firstName);
	
//	function to find records of person having age less than given age
	public Iterable<Person> findAllByAgeLessThan(Integer age);

//	function to find records of person having age greater than given age
	public Iterable<Person> findAllByAgeGreaterThan(Integer age);
	
	
//	Incorporating Custom Queries 
//	JQL - (JPA) Query Language
//	in place of Column name we must use Attribute name
	@Query("select firstName from Person p where p.email=:email")
	public String read1(String email);
	
	@Query("select firstName from Person p where p.email=:arg")
	public String read2(String arg);
	
	@Query("select firstName from Person p where p.email=?1")
	public String read3(String email);
	
	@Query("select firstName from Person p where p.age > ?1")
	public Iterable<String> read4(Integer age);
	
	@Query("select firstName, lastName from Person")
	public Iterable<String[]> read5();
//	public Iterable<Object[]> read5();
	
	@Query("from Person")
	public Iterable<Person> read6();
	
	@Query("from Person p where p.id <= :id")
	public Iterable<Person> read7(Integer id);
	
	@Query("select age from Person p where p.id <= :id or p.firstName = :firstName")
	public Iterable<Integer> read8(Integer id , String firstName);
	
	@Query("select age, email from Person p where p.id <= ?1 or p.firstName = ?2")
	public Iterable<Object[]> read9(Integer age, String firstName);
	
//	Incorporating Raw SQL commands into Query
	
	@Query(value="select * from person", nativeQuery=true)
	public Iterable<Person> read10();
	
	@Query(value="select * from person where first_name = ?1", nativeQuery=true)
	public Iterable<Person> read11(String firstName);
	
	@Query(value="select first_name, last_name from person", nativeQuery=true)
	public Iterable<String> read12();
//	public Iterable<String[]> read12();
//	public Iterable<Object[]> read12();
	
	@Query(value="select last_name from person", nativeQuery=true)
	public Iterable<String> read13();
	
//	generating method to query DTO 
//	should mention package name
	@Query("select new com.example.jpadev7.PersonDTO(p.firstName, p.email, p.age) from Person p")
	public Iterable<PersonDTO> read14();
}
