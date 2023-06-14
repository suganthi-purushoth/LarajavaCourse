class I 
{
	static int m;
	int n;
	static void test1()
	{
		System.out.println("from test1");
	}
	void test2()
	{
		System.out.println("from test2");
	}
}
class J extends I
{
	public static void main(String[] args) 
	{
		System.out.println(J.m);//cls ref because its static
		J.test1();//cls ref because its static

		J ref=new J();
		System.out.println(ref.n);//create a ref because its non static
		ref.test2();
	}
}
/*
D:\java-program-lab\inheritance\src>java -cp ../classes J
0
from test1
0
from test2*/