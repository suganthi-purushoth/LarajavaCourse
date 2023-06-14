class Z8
{
	public static void main(String[] args) 
	{
	
		System.out.println("main begin");
		char b1=test();
		
		System.out.println("main end: "+b1);
	}
	public static char test()
	{

		System.out.println("from test");
		return '$';
	}
}

/*
D:\java-program-lab\method\app1\src>java -cp ../classes Z8
main begin
from test
main end: $
*/
