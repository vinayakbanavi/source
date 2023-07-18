package pack3;

// generic class
// unbounded wild card   --> <?>  ? means type
// if we supply Integer to ? only Integer type objects are allowed 
// if we don't supply any Type it acts as a NonGen class<Object --> ?>, Allows all type.

class B<T> // using as a parameter
{
//	using as datatype for field
	T field;
	
//	using as argument of a method
	public void test1(T arg)
	{
		System.out.println(arg);
	}
	
//	using as return Type
	public T test2()
	{
		return field;
	}
	
}
public class M2 
{
	public static void main(String[] args) 
	{
		B<Integer> b1 = new B();
		b1.field = 125;
		
		B<Double> b2 = new B();
		b2.field = .15;
		
		B<Character> b3 = new B();
		b3.field = 'A';
		
		B b4 = new B();
		b4.field = 100;
		b4.field = 100.5;
		b4.field = 'A';
		b4.field = false;
		b4.field = "hello";
	}
}
