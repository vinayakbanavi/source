class Person
{
	String name;
	String address;
	int age;
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.name = "Akshay";
		p1.address = "bangalore";
		p1.age = 25;

		Person p2 = new Person();
		p2.name = "sameer";
		p2.address = "hubli";
		p2.age = 26;
		System.out.println(p1.name + ", " + p1.address + ", " + p1.age);
		System.out.println(p2.name + ", " + p2.address + ", " + p2.age);
	}
}
	