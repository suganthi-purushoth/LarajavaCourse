class Y
{
	public static void main(String[] args) 
	{
	
		System.out.println("main begin");
		int i=test();
		System.out.println("in the main:"+i);
		System.out.println("main end");
	}
	public static int test()
	{

		System.out.println("from test");
		return 100;
	}
}

/*

D:\java-program-lab\method\app1\src>java -cp ../classes Y
main begin
from test
in the main:100
main end
*/
