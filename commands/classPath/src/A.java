// class B is lcated in the F folder we need to specify the location before usage
// >javac -d ../classes -classpath F:\pack1\app1\classes A.java

class A 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("Hello World!" + b1.getMessage());
	}
}
