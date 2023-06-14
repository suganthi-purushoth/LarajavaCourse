class Z3
{
	public static void main(String[] args) 
	{
	
		System.out.println("main begin");
		
		System.out.println(test()+"in the main:");
		System.out.println("main end");
	}
	public static int test()
	{

		System.out.println("from test");
		return 100;
	}
}

/*
D:\java-program-lab\method\app1\src>java -cp ../classes Z3
main begin
from test
100in the main:
main end
*/
