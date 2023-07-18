package pack5;

import pack4.G; 

class C
{
	public static void main(String[] args) 
	{
		G g1 = new G();          
		System.out.println("hello world");
	}
}

/*

- importing should be after package, by importing we can access one package classes inside another package
- import pack4.G ---> imports only G class from pack4
- import pack4.* ---> imports all the public classes from pack4

*/