class B2
{
	public static void main(String[] args) 
	{
//      forName("") method in class Class throws ClassNotFoundException
		Class.forName("");
	}
}


// Class.forName("java.lang.String"); is used to load a specified class to the memory Explicitly
// Class is built in class
// forName is a Static method
// while using this method compiler will be looking for try catch or throws Exception
// Checked type : ClassNotFoundException
// Compiler looks for proper syntax if not perfect throws ClassCastException


