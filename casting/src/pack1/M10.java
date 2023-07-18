package pack1;

public class M10 
{
	public static void main(String[] args) 
	{
		int i = 130;
		short s1 = (byte)i;
//		         = -128 + (130 - 128)
//		         = -126
//       short  <-- byte      autoWidening		
		
		System.out.println(i);
		System.out.println(s1);
	}
}
// narrowing --> not recommended
// narrowing narrower than required is absolutely not recommended.