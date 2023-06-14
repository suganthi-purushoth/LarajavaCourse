class Z12
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
		
		return 100+300;
	}
}

/*

D:\java-program-lab\method\app1\src>java -cp ../classes Z12
main begin
from test1
main end: 400

*/
