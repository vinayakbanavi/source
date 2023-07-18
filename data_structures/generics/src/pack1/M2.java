package pack1;


class B
{
	String s1;
	
	B(String s1 )
	{
		this.s1 = s1;
	}
}

public class M2
{
	public static void main(String[] args) 
	{
		B b1 = new B("shradda");
		B b2 = new B("ashrit");
		B b3 = new B("loki");
		B b4 = new B("shreemant");
		
//		B b5 = new B(55); type incompatible
		
//		for every Object of class B Datatype of variabe s1 will be String and it is fixed
	}
}
