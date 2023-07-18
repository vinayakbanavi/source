// Person repository is required to perform CRUD operations
// it should be a interface
// and should be a sub interface to CrudRepository<>

package com.example.jpadev2;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer>
{
	
}
