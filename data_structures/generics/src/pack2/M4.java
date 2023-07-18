package pack2;

// as a return type
class D<T>
{
	T field;
	
	public T test()
	{
		return field;
	}
}
public class M4 
{
	public static void main(String[] args) 
	{
		D<Integer> d1 = new D();
		d1.field = 100;
		int i = d1.test();
		
		D<String> d2 = new D();
		d2.field = "Vinayak";
		String s1 = d2.test();
		
		D<Boolean> d3 = new D();
		d3.field = false;
		boolean b1 = d3.test();
		
//		without supplying DataType through generics
		{
			D d4 = new D();
		
			d4.field = 100;
	//		int i = d4.test();       		     --> Type incompatible (Object --> int)
			Object obj1 = d4.test();
			
			d4.field = 100.5;
	//		double d = d4.test();   	 		 --> Type incompatible (Object --> double)
			Object obj2 = d4.test();
			
			d4.field = "hello";
	//		String s2 = d4.test();                --> Type incompatible (Object --> String)
			String s2 = (String) d4.test();	//   --> downcasting from Object to String
		}
	}
}
