package pack4;

import java.util.ArrayList;
import java.util.Collections;

class F implements Comparable
{
	int age;
	char gender;
	
	F(int age, char gender)
	{
		this.age = age;
		this.gender = gender; 
	}
	
	public String toString()
	{
		return "(" + age + ", " + gender + ")"; 
	}
	
	public int compareTo(Object obj)
	{
//		by default compareTo method can sort based on single attribute in a class at a time
//		sorting based on multiple attributes, switching is not convenient
		
		return age - ((F)obj).age;
//		return Character.valueOf(gender).compareTo(Character.valueOf(((F)obj).gender));
		
	}
}

public class M6
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(new F(25, 'M'));
		list.add(new F(32, 'F'));
		list.add(new F(21, 'F'));
		list.add(new F(35, 'M'));
		list.add(new F(29, 'F'));
		list.add(new F(18, 'M'));
		
		System.out.println("list : " + list);
		
		Collections.sort(list);
		System.out.println("sort : " + list);
	}
}
