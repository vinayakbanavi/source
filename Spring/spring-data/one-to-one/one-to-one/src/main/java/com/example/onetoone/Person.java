package com.example.onetoone;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	generates id for each record based on the different strategy
	
	private Integer id;
	private String firstName;
	private String lastName;
	
//	while reading a Person we wont get address mapped with this person
//	if only one table is having mapping it is Unidirectional
//	if Both Person and Address having OneToOne mapping it is bidirectional mapping
	

	
	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private Address address;
	
	public Integer getId() 
	{
		return id;
	}
	
	public void setId(Integer id) 
	{
		this.id = id;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public Address getAddress() 
	{
		return address;
	}

	public void setAddress(Address address) 
	{
		this.address = address;
	}
}


/*
 		Json Body
 		
 -->    No need to post id, as id getting auto generated 
 		{
 			"firstName": "vinayak",
 			"lastName": "banavi"
 		}
 		
 	
 -->    in Bidirectional Mapping
 		 
 	1.  Both Parent and Child Table have foreign keys which is not desirable.
 		Foreign key must be in the child table
 			in order to remove ForeinKey from ParentTable we must specify this along with OneToOne(mappedBy = "childclass fk") 
 			
 	2.  By default we can't add records to the child table from parent table
 			We need to Explicitly allow Operations along with OneToOne(cascade = CascadeType.ALL)
 			
 		drawback : address table not picking up the ids of Person(not mapping to the corresponding Person)
 		
 		{
			"firstName":"Vijayendra",
		  	"lastName" : "Ingalagi",
		  	"address" :	{
		      				"houseNo" : "100/A",
		                    "street"  : "BTM",
		                    "city"    : "Bangalore"
				        }
		}

	3. So third approach to overcome the above drawback
	 	Adding id explicitly into the child record 
	 	but this is not recommended (client not able to remember all the id's )
	 	
		{
			"firstName":"Vijayendra",
		  	"lastName" : "Ingalagi",
		  	"address" :	{
		      				"houseNo" : "100/A",
		                    "street"  : "BTM",
		                    "city"    : "Bangalore"
		                    
		                    "person"  : {"id" = 1}
				        }
		}
		
	4. To overCome the above drawback 
	   Alter the Controller Where before saving the records Attach the Parent table id with child table-
	   person.getAddress().setPerson(person);
	   
	5. Above Modification will lead to cyclic insertion while Adding record
	     drawback - Jackson databound cyclic error
	
	6. To overCome the above drawBack
	   We must Explicitly Specify @JsonIgnore in to the child table After @OneToOne
	   so that it will ignore the cyclic assign
 */
