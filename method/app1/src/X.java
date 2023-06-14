class X
{
	public static void main(String[] args) 
	{
	
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	public static int test()
	{

		System.out.println("from test");
		return 100;
	}
}

/*


D:\java-program-lab\method\app1\src>java -cp ../classes X
main begin
from test
main end

*/
