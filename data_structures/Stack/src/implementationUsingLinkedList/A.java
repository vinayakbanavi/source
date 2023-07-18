package implementationUsingLinkedList;

public class A
{
	public static void main(String[] args) 
	{

			Stack<Integer> s1 = new Stack();
			
			s1.push(2);
			s1.push(3);
			s1.push(5);
			s1.push(6);
			s1.push(8);
			s1.push(1);
			

			while(!s1.isEmpty())
			{
				System.out.println(s1.pop());
			}
	}
}
