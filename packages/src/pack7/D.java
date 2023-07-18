package pack7;

import pack6.*;

class D
{
	public static void main(String[] args) 
	{
		System.out.println("from pack7 class D");

		A a1 = new A();

//		a1.i = 10;  
//		i has private access in class A
//		cannot be used outside class A


//		a1.j = 20;
//		j is not public in A
//      cannot be accessed outside package 


//		a1.k = 30;
//      k has protected access in A
//      cannot be used directly outside package 


		a1.l = 40;


//		System.out.println(a1.i);
//		System.out.println(a1.j);
//		System.out.println(a1.k);
		System.out.println(a1.l);
	}
}
