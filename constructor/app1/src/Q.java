class Q 
{
	Q()//no arg constructor 
	{
		this(10);
		System.out.println("Q()");
	}
	Q(int i)//int as a arg to passing 1 value
	{
		this(1,20);
		System.out.println("Q(int)");
	}
	Q(int i,int j)//2 arg constructor to passing 2 int values
	//in this constructor not calling another constructor
	{
		System.out.println("Q(int,int)");
	}
	public static void main(String[] args) 
	{
	    Q q1=new Q();
		System.out.println("-----------");
		Q q2=new Q(10,20);
		System.out.println("-----------");
		Q q3=new Q(30);
		System.out.println("-----------");
	}
}
/*

D:\java-program-lab\constructor\app1\src>java -cp ../classes Q
Q(int,int)
Q(int)
Q()
-----------
Q(int,int)
-----------
Q(int,int)
Q(int)
-----------
*/