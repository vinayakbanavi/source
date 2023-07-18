package pack3;

public class M3
{
	public static void main(String[] args) 
	{
		C c1 = new C();   // derived reference type and Object type are same so no up casting.
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c1.k);
		
		A a1 = new C();	// derived reference is of superclass and object is of subclass Auto upcasting.
		System.out.println(a1.i);
//		System.out.println(a1.j); // compiler allows to use the same members from derived reference class.
//		System.out.println(a1.k);
		
		if (a1 instanceof C)      // Before downcasting check whether Object is instance of the specific class or not
		{
			C c2 = (C) a1;	      // to use all the members downcasting must be done
			System.out.println(c2.i);
			System.out.println(c2.j);
			System.out.println(c2.k);
		}
	}
}

// upCasting is essential to achieve polyMorphism
// static members undergo compileTime polyMorphism (method overloading)
// instance members undergo runTime polyMorphism (method overriding)