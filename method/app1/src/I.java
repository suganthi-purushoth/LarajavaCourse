class I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("-------------");
		test2();
		System.out.println("main end");
		

		
	}
	public static void test1()
	{
		System.out.println("from test1");
	}
	public static void test2()
	{
		System.out.println("from test2");
	}
}

/*

D:\java-program-lab\method\app1\src>java -cp ../classes I
main begin
from test1
-------------
from test2
main end
*/