package pack5;

class I extends H
{
	public static void main(String[] args) 
	{
		I obj = new I();
	    //System.out.println(obj.i);
	    System.out.println(obj.j);
		System.out.println(obj.k);
	}
}

//whenever protected member inheriting to subclass of another package then it must be used within the same subclass