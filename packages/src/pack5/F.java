package pack5;

import pack4.G; 

class F extends G
{
	public static void main(String[] args) 
	{
		G g1 = new G();            // even though F inheriting G but Object is creating in G itself
	 // System.out.println(g1.i);
	 // System.out.println(g1.j);
		System.out.println(g1.k);
	}
}