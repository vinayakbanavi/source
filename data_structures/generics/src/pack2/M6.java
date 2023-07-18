package pack2;

interface F<T>
{
	void test1(T arg);
	
	T test2(T arg);
}

class G implements F<String> // implements F with fixed DataType 
{
	public void test1(String arg)
	{
		System.out.println("G - test1");
	}
	
	public String test2(String arg)
	{
		System.out.println("G - test2");
		return "hello";
	}
}

class H<U> implements F<U> // implements F with Generic DataType
{
	public void test1(U arg)
	{
		System.out.println("H test1");
	}
	
	public U test2 (U arg)
	{
		System.out.println("H test2");
		return null;
	}
}

public class M6 
{
	public static void main(String[] args) 
	{
//		for every object of G test1 arg will be String
		{
			G g1 = new G();
			g1.test1("hello");
			String s1 = g1.test2("hello");
			
			G g2 = new G();
			g2.test1("hii");
			String s2 = g2.test2("hii");
		}
		
//		but for every object of the H test1 arg will change with the generic DataType
		System.out.println();
		{
			H<Integer> h1 = new H();
			h1.test1(100);
			int i = h1.test2(200);
			
			H<String> h2 = new H();
			h2.test1("Jade");
			String s1 = h2.test2("String");
			
			H<Boolean> h3 = new H();
			h3.test1(false);
			boolean b1 = h3.test2(false);
 		}
	}
}
