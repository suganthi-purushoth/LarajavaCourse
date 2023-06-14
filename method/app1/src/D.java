class D
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	public static void test()
	{
		System.out.println("from test");
	}
}

/*


D:\java-program-lab\method\app1\src>java -cp ../classes D
main begin
from test
main end


*/