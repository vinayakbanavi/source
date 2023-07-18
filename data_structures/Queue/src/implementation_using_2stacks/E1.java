package implementation_using_2stacks;

public class E1 
{
	public static void main(String[] args) 
	{
		QueueImplByStacks object = new QueueImplByStacks();
		
		QueueImplByStacks.Queue<Integer> q = object.new Queue();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}
	}
}
