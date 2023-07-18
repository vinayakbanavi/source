package pack2;

public class M2 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		B b1 = new C();   // B b1 = (B) new C(); auto upCasting
		A a2 = new C();   // A a2 = (A) new C(); auto upCasting     
		
		a1 = b1;
		a2 = new B();
		
		System.out.println("done");
	}
}

/*
  ---> when left handside  --> superclass
            right handside --> subclass
            
       Auto upcasting --> compiler convert the subclass to superclass
           
  												
  							upcasting (subclass assigning to superclass)
  										<--------------------
 								 extends       extends			extends
 						Object<-----------A <----------  B  <------------ C
 										 ------------------->
 							Downcasting(superclass assigning to subclass)
 */


