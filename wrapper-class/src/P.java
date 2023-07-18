class P 
{
	public static void main(String[] args) 
	{
		int i = 10;

		Integer obj  = Integer.valueOf(i)       // manual boxing
		Integer obj1 = i;                       // auto boxing  java 1.5
		Integer obj2 = 10;

		int i1 = obj1.intValue();               // manual unboxing
		int i2 = obj1;                          // auto unboxing
		int i3 = obj2

//      in auto boxing and unboxing compiler automatically putting Integer.valueOf(value)  and obj.intValueOf() 
		System.out.println("done");
	}
}
