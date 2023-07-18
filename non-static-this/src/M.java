class M
{
int p;
double q;
M(int p, double q)
{
p = p;
q = q;
//we can develop any thing
}
public static void main(String[] args) 
{
M obj1 = new M(1, 5.0);
M obj2 = new M(20, 30.0);
M obj3 = new M(40, 5.0);
M obj4 = new M(200, 2.05);
M obj5 = new M(5, 50.1);
System.out.println(obj1.p + ", " + obj1.q);
System.out.println(obj2.p + ", " + obj2.q);
System.out.println(obj3.p + ", " + obj3.q);
System.out.println(obj4.p + ", " + obj4.q);
System.out.println(obj5.p + ", " + obj5.q);
obj1.p = 20;
obj1.q = 2.0;
obj2.p = 30;
obj2.q = 3.0;
obj3.p = 40;
obj3.q = 4.0;
obj4.p = 50;
obj4.q = 5.0;
obj5.p = 60;
obj5.q = 6.0;
System.out.println(obj1.p + ", " + obj1.q);
System.out.println(obj2.p + ", " + obj2.q);
System.out.println(obj3.p + ", " + obj3.q);
System.out.println(obj4.p + ", " + obj4.q);
System.out.println(obj5.p + ", " + obj5.q);
}
}