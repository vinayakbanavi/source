package pack1;

public class M3 
{
	public static void test(double d)
	{
		System.out.println("done");
	}
	
	public static void main(String[] args) 
	{
		byte b1 = 100;
		short s1 = 100;
		int i = 100;
		long j = 100;
		float f1 = 100;
		
		test(b1);
		test(s1);   // test((double) s1); auto widening
		test(i);
		test(j);
		test(f1);
		
//		from above statements while calling test() supplying types are narrower than method argument type
//		Compiler will auto widen the supplying type 
	}
}
