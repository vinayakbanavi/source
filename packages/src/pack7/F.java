package pack7;

import pack6.*;

class F extends A
{
	public static void main(String[] args) 
	{
		System.out.println("from pack7 class D");

		F a1 = new F();

//		a1.i = 10;  
//		i has private access in class A
//		cannot be used outside class A


//		a1.j = 20;
//		j is not public in A
//      cannot be accessed outside package 


		a1.k = 30;
//      k has protected access in A
//      cannot be used directly outside package 


		a1.l = 40;


//		System.out.println(a1.i);
//		System.out.println(a1.j);
		System.out.println(a1.k);
		System.out.println(a1.l);
	}
}


// Even though inheriting class A, But we are dirctly using it creating Object in class A
// protected members can be used through subclasses in any package