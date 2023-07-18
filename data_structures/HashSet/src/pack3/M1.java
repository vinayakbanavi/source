package pack3;

import java.util.HashSet;

class A
{
	int age;
	
	A(int age)
	{
		this.age = age;
	}
}

public class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A(25);
		A a2 = new A(28);
		A a3 = new A(25);
		A a4 = new A(28);
		
		{
			String s1 = "" + a1;
			String s2 = a2.toString();
			String s3 = new A(15).toString();
			
			System.out.println("s1 --> " + s1 + ", a1 --> " + a1 );
			System.out.println("s2 --> " + s2 + ", a2 --> " + a2 );
		}
		
		{
			HashSet set = new HashSet();
			set.add(a1); // whenever we print or read reference variable or Object we get memory address
			set.add(a2);
			set.add(a3);
			set.add(a4);
			set.add(new A(25));

			System.out.println("set : " + set);
		}
	}
}
