class Z 1
{
	public static void main(String[] args) 
	{
		System.out.println(true  && true); // if any one operand is false the result will be false
		System.out.println(true  && false);
		System.out.println(false && false);
		System.out.println(false && true); 
	}
}
// && -->	REPRESENTS LOGICAL operates just opposite as ||
// in case of &&  the result will be true only when both the operands are true
/*
true
false
false
false
*/