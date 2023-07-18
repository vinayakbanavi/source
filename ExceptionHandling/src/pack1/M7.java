package pack1;

public class M7 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		int[] elements = {10, 20, 30};
		int i1 = elements[3];             
//		trying to assign element from elements at 3rd index
		
//		Abnormality - ArrayIndexOutOfBoundException
//		Not handled FLow get Terminates
		
		System.out.println("main end");
	}
}
