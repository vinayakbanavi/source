package pack1;

enum Title
{
//  For every constant object will be created 
//	while object creating non static members will load to the memory of the object
	MR("Mr."),
	MRS("Mrs."),
	MS("Ms.");
	
	private final String title;
	
	private Title(String title)
	{
		this.title = title;
	}
	
	public String format(String firstName)
	{
		return title + firstName;
	}
}

public class M6 
{
	public static void main(String[] args) 
	{
		System.out.println(Title.MR.format("Vinayak"));
	}
}
