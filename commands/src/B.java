// using A class available inside jar file
// >javac -d ../classes -classpath D:\november-batch-dev\commands\lib\abc.jar B.java
// >java -cp D:\november-batch-dev\commands\lib\abc.jar;. B

class B 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("Hello World!" + a1.getMessage());
	}
}
