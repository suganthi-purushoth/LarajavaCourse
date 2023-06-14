class Z10
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		int b1=test();
		
		System.out.println("main end: "+b1);
	}
	public static int test()
	{

		System.out.println("from test");
		int i=100;
		return i;
	}
}

/*

D:\java-program-lab\method\app1\src>java -cp ../classes Z10
main begin
from test
main end: 100
*/
