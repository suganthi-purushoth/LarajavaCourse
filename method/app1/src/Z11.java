class Z11
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		int b1=test1();
		
		System.out.println("main end: "+b1);
	}
	public static int test1()
	{

		System.out.println("from test1");
		
		return test2();
	}
	public static int test2()
	{
		System.out.println("from test2");
		return 200;
	}
}

/*


D:\java-program-lab\method\app1\src>java -cp ../classes Z11
main begin
from test1
from test2
main end: 200

*/
