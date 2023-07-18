package pack2;

class B<T>
{
	T property;
	
	B(T property)
	{
		this.property = property;
	}
}

public class M2 
{
	public static void main(String[] args) 
	{
		B<Integer> b1 = new B(25);
		System.out.println(b1.property);
		
		B<String> b2 = new B("hello");
		System.out.println(b2.property);
		
//		<Object> so we can supply all type of element (Auto upcasting);
		B b3 = new B(10);
		B b4 = new B(2.5);
		B b5 = new B('A');
		B b6 = new B(false);
		B b7 = new B("String");
		B b8 = new B(null);
	}
}
