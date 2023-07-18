package pack3;

public class M2 
{
	public static void main(String[] args) 
	{
		A a1 = new C();
		
		System.out.println(a1.i);
//		System.out.println(a1.j);
//		System.out.println(a1.k);
		
		B b1 = (B) a1;
		System.out.println(b1.i);
		System.out.println(b1.j);
//		System.out.println(b1.k);
		
		C c1 = (C) a1;
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c1.k);
		
	}
}

/*
 		Whenever Up casting is happening unable to use everyMember
 		to use every member down casting is required
 		
 */
