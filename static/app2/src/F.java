class F
{
	static 
	{
		System.out.println("from SIB1");
	}
	static int i=test1();
	static int j=test2();
	static
	{
		System.out.println("from SIB2");
	}
	static int test1()
	{
		System.out.println("from test1");
		return 10;
	}
	static int test2()
	{
		System.out.println("from test2");
		return 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("main:"+i+","+j);
	}
}
/*
D:\java-program-lab\static\app2\src>java -cp ../classes F
from SIB1
from test1
from test2
from SIB2
main:10,20
*/