package problems;

import java.util.Stack;

public class stackUpsideDown 
{
	public static void main(String[] args) 
	{
		Stack<Integer> s1 = new Stack();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		
		
		upsideDown(s1);
		
		while(!s1.isEmpty())
		{
			System.out.println(s1.pop());
		}
	}
	
	public static void upsideDown(Stack<Integer> s1)
	{
		if(s1.isEmpty())
		{
			return;
		}
		
		int top = s1.pop();
		upsideDown(s1);
		pushToBottom(s1, top);
	}
	
	public static void pushToBottom(Stack<Integer> s1, int data)
	{
		if(s1.isEmpty())
		{
			s1.push(data);
			return;
		}
		
		int top = s1.pop();
		pushToBottom(s1, data);
		s1.push(top);
	}
}
