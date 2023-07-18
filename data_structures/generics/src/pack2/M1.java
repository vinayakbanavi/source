package pack2;

class A<T>
{
	T field;
}

public class M1
{
	public static void main(String[] args) 
	{
//		A<Object> a = new A<Object>();
//		A<Object> a = new A<>();                       All are valid syntax.
//		A<Object> a = new A();
		
		A<Integer> a1 = new A();
		a1.field = 100;
		
		A<String> a2 = new A();
		a2.field = "hello";
		
		A a3 = new A();  // if we dont provide any <Datatype> by default <Object> will be taken
		a3.field = 10;
		a3.field = 100.5;
		a3.field = 'A';
		a3.field = true;
		a3.field = "String";
		a3.field = null;
	}
}

/*

*/