/**
 * 	UnitTesting : 
 				Testing the chunks or component of source code.
 				Early detection of defects
 				improves code quality
 				
 	JUnit : 
 				It is a u nit testing framework for java
 				
 				features : 
 				openSource
 				provides Annotations
 				provide Assertions
 				provide Unit runners
 				provide automation
 				
 	Mockito :
 				Mockito is a framework used for unit testing an java application
 				By this framework create an testable application
 				
 				The main goal of this framework is to test the application
 				without depending on the back end systems. 
 				
 				Scenario :
 				Testing the component which internally calling the back end(database)
 				if we want to test the scenarios when back end was not working(Database servers need to shutdown)
 				or we need to test the scenarios for different data sets(Integrating unnecessary data into database)
 				SO in these scenarios A component will be depending on another component
 				
 	Mocking : refers to the development of Objects which mocks the real object
 	
 	Mockito Implementation
	1. Stubbing : refers to the Mock object with pre defined data
				: suppose we are testing a method in class A
				: we can request mock object by following syntax
				
				without annotations
				: A object = Mockito.mock(A.class);
				
				with annotations
				
				@Mock
				A object;
				
	2. Expectation :
				: Mock object must behave exactly as real object
				: it must contain all the members as real object
				: particular input must have particular output
				
				when X call. thenReturn Y
				Mockito.when(mockobj.method()).thenReturn(returnMockResponse);
				Mockito.when(mockobj.method()).thenThrows(Exception object)   
				Mockito.when(mockobj.method()).thenCallMethod();
				
				
				Mockito.when(object.findPrime()).thenReturn(7);
				 
	3. Verify : verification of real object using verify();
	
	Note : 
	1. Developer only will create request and response
	2. before calling backend mockito will stop the process return back with the predefined mock response
			
 */


package pack1;

public class A1 
{
	public String print()
	{
		return "hii from A1";
	}
}
