	package pack4;

	class D8 
	{
		public static void main(String[] args) 
		{
			System.out.println("main begin");
			if (true)
			{
				System.out.println("from if");
	//          throw is a keyword used to generate specified Error/Exception Object explicitly from runtime environment
	//			throw statement must be last statement in the current definition block like break, continue and return

				throw new ArithmeticException();
			}
			System.out.println("main end");
		}
	}
