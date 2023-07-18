class  L
{
	String firstname;
	public static void main(String[] args) 
	{
		L obj1 = new L();
		obj1.firstname = "swetha";
		L obj2 = new L();
		obj2.firstname = "mohan";
		System.out.println(obj1.firstname);
		System.out.println(obj2.firstname);
	}
}

// for every object seperate copy of non static member, for same class any number of object