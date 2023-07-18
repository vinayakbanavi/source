package pack4;

import java.util.ArrayList;
import java.util.Collections;

class E implements Comparable
{
	char c;
	
	E(char c)
	{
		this.c = c;
	}
	
	public String toString()
	{
		return c + "";
	}
	
	public int compareTo(Object obj)
	{
//		return Character.valueOf(c).compareTo(Character.valueOf(((E)obj).c));
		return Character.valueOf(c).compareTo(((E)obj).c);
	}
}
public class M5 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(new E('A'));
		list.add(new E('Z'));
		list.add(new E('W'));
		list.add(new E('X'));
		list.add(new E('V'));
		list.add(new E('H'));
		
		System.out.println("list    : " + list);
		
		Collections.sort(list);
		System.out.println("sorted  : " + list);
	}
}
