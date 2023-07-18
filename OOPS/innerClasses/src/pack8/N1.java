package pack8;

public class N1 
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("--------------------");
		D d2 = new D() 
		{
			{
				System.out.println("AIC-D");
			}
		};	
	}
}

// Anonymous class can have SIB, IIB, Attributes, Methods, 
// but they cannot have Constructors and hence we can't create Object