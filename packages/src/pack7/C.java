package pack7;

import pack6.A;

class C 
{
	public static void main(String[] args) 
	{
		System.out.println("from pack7 class C");

		A a1 = new A();

		a1.i = 10;
		a1.j = 20;
		a1.k = 30;
		a1.l = 40;


		System.out.println(a1.i);
		System.out.println(a1.j);
		System.out.println(a1.k);
		System.out.println(a1.l);
	}
}
