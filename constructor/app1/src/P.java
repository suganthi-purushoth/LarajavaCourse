class P 
{
	P()//no arg constructor 
	{
		this(10,20);
		System.out.println("P()");
	}
	P(int i,int j)//int as a arg
	{
		System.out.println("P(int,int)");
	}
	public static void main(String[] args) 
	{
	    P p1=new P();
		System.out.println("-----------");
		P p2=new P(1,2);
		System.out.println("-----------");
	}
}
/*
D:\java-program-lab\constructor\app1\src>java -cp ../classes P
P(int,int)
P()
-----------
P(int,int)
----------
*/