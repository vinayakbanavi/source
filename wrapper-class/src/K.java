class K
{
	public static void main(String[] args) 
	{
		Double obj1 = Double.valueOf("12.5");
		double d1 = obj1.doubleValue();

		Float obj2 = Float.valueOf("12.5");
		float f1 = obj2.floatValue();

		System.out.println("sum is : " + (d1 + f1));
	}
}
