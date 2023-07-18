class A3
{
	public static void main(String[] args) 
	{
		String s1 = "A1d3hb4";
        
		//removing non integer characters from the string
		String s2 = s1.replaceAll("[^0-9]","");
        
		//parsing the integer fro the string
		int j = Integer.parseInt(s2);
        
		// int to char array
		char[] a = Integer.toString(j).toCharArray();

		//int to char array using string value of
		char[] b = String.valueOf(j).toCharArray();
        
		//converting String to char Array
		char[] c = s2.toCharArray();

	}
}

