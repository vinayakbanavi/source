package pack1;

import static org.mockito.Mockito.verify;

import org.mockito.Mock;
import org.mockito.Mockito;

public class TestA1 
{
	public void test()
	{
//		Stubbing : without annotations
		A1 object1 = Mockito.mock(A1.class);

//		Expectation
		Mockito.when(object1.print()).thenReturn("Hello");

//		verification
		verify(object1.print());
	}
}
