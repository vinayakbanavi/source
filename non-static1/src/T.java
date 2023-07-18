class T 
{
	T()
	{
		this(9, 89);
		System.out.println("T()");
	}

	T(int i, int j)
	{
		System.out.println("T(int,int)");
	}

	public static void main(String[] args) 
	{
		T t1 = new T();
		System.out.println("------------");
		T t2 = new T(20, 60);
		System.out.println("------------");
	}
}

// this calling statement always should be the first statement in the constructor body