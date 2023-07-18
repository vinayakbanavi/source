package implementation_using_array;

public class Q1
{
	public static void main(String[] args) 
	{
		Qyu<Integer> q1 = new Qyu(5);
		System.out.println(q1.offer(10));
		System.out.println(q1.offer(10));
		System.out.println(q1.offer(10));
		System.out.println(q1.offer(10));		
		
		System.out.println(q1.add(20));
		System.out.println(q1.poll());
		System.out.println(q1);
//		q1.add(30);
		
	}
}
