package pack2;

import java.util.HashMap;

class D
{
	String name;
	double salary;
	
	D(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()
	{
		return "(" + name + ", " + salary + ")";
	}
	
	public int hashCode()
	{
		return name.hashCode() + Double.toString(salary).hashCode();
	}
	
	public boolean equals(Object obj)
	{
		return obj instanceof D && 
			   name == ((D)obj).name && 
			   salary == ((D)obj).salary;
	}
}

public class M4 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put(new D("Divakar", 15000.6), "object1");
		map.put(new D("Shivaraj", 30000.5), "object2");
		map.put(new D("Sharmila", 25000.3), "object3");
		map.put(new D("Sharmila", 25000.3), "object4");
		map.put(new D("Roopa", 29000.5), "object5");
		map.put(new D("Shalini", 17000.5), "object6");
		map.put(new D("Shalini", 17000.5), "object7");
		
		System.out.println("map : " + map);
		map.put(new D("Roopa", 29000.5), "object8");
		map.put(new D("Sharmila", 50000.3), "object9");
		
		System.out.println("map : " + map);
		
	}
}

//		Worth remembering 
//		Wrapper class hashcode() and String class hashCode gives different values

//		double d = 25.9;
//		Double value = new Double(d);
//		System.out.println(value.hashCode());
//		System.out.println(Double.valueOf(d).hashCode());

//		System.out.println(Double.toString(d).hashCode());