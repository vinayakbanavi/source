package pack3;

import java.util.ArrayList;

class C
{
	
}

class D extends C
{
	
}

class E extends D
{
	
}
class F extends E
{
	
}
//	Upper bounded WildCard
//  ? extends SuperClass
//	here ? can be any subclass to the superclass, restriction are little less as compared to unbounded

class G<T extends D>
{
	T ref;
}

public class M3 
{
	public static void main(String[] args) 
	{
//		valid supply to UpBound WildCard
		{
			G<D> g1 = new G();
			g1.ref = new D();
//	 		g1.ref = new E();           // auto UpCasting 
//			g1.ref = new F();
			
			G<E> g2 = new G();
			g2.ref = new E();
//			g2.ref = new F();           // auto upcasting
			
			G<F> g3 = new G();
			g3.ref = new F();
		}
		
		ArrayList<? extends C> list = new ArrayList<C>();
//		list.add(new D());
//		inValid supplies
		{
//			G<C>       g1 = new G();           // Bound mismatch
//			G<Object>  g2 = new G();
//			G<Integer> g3 = new G();
			
		}
	}
}
