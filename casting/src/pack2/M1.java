package pack2;

class A
{
}

class B extends A
{
}

class C extends B
{
	
}

public class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		
//		Homogeneous assignment : assigning reference is of same class type
		A a2 = a1;
		B b2 = b1;
		C c2 = c1;
		
//		assigning new Object to the existing reference
		a1 = new A();
		b1 = new B();
		c1 = new C();
		
		System.out.println("done");
	}
}
/*
 		Derived Casting --> Converting One derived data type into another derived data type
 		derived --> Any class And Any interface
 		
 		Derived casting is possible only for the classes which are under one inheritance only
 		Derived casting is not possible if Two left Operand and right operand are not under single inheritance 
 		Homogeneous assignment not require conversion (if reference and Object are of same type)
 */



