// Declaration of enum outside class 

package pack1;

enum Days
{
	Monday,
	Tuesday,
	Wednesday,
	Thursday,
	Friday,
	Saturday,
	Sunday
}

/*
 		Internally enum will be implemented by using class
 		Every enum constant represents an object of type enum.
		enum type can be passed as an argument to switch statements.
 		
 		class Days
 		{
 			public static final Days Monday = new Days();
 			public static final Days Tuesday = new Days();
 			public static final Days Wednesday = new Days();
 			public static final Days Thursday = new Days();
 			public static final Days Friday = new Days();
 			public static final Days Saturday = new Days();
 			public static final Days Sunday = new Days();
 		}
 */
public class M1 
{
	public static void main(String[] args) 
	{
		System.out.println(Days.Sunday);
		
//		using enum constants for switch block
		
		Days day = Days.Saturday;
		
		switch(day)
		{
			case Monday:
				System.out.println("Monday seems Stressful");
				break;
				
			case Tuesday:
				System.out.println("Tuesday follows Monday");
				break;
				
			case Wednesday:
				System.out.println("Balanced between Wednesday");
				break;
			
			case Thursday:
				System.out.println("Thursday seems Exhausted");
				break;
			
			case Friday:
				System.out.println("Friday seems Quite long");
				break;
				
			case Saturday:
				System.out.println("Saturday feels awesome");
				break;
				
			case Sunday:
				System.out.println("Sunday is a Sleepday");
				break;
			
				default:
				System.out.println("All days must be Sunday");
				break;
		}
		
	}
}
