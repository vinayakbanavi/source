package com.example.onetoone;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Integer>
{
	
//	@Query("from Address a where a.id =: (select p.id from com.example.onetoone.Person p where p.firstName = ?1)")
	@Query(value = "select * from Address A where id = (Select Id from Person Where firstname = ?1)" , nativeQuery=true)
	public Iterable<Address> readAddres(String firstName);
}
