class E 
{
	static int i;
}
class F extends E
{
	static int j;
	public static void main(String[] args) 
	{
		System.out.println(F.i);
		System.out.println(F.j);
	}
}
//static varible are also inheriting to the  sub class from the superclass.
//by using sub class reference only we can access static members of subclass.no need of creating object.
//even by creating object to subclass also we access static variables.
/*
D:\java-program-lab\inheritance\src>java -cp ../classes F
0
0
*/
