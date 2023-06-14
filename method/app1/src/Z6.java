class Z6
{
	public static void main(String[] args) 
	{
	
		System.out.println("main begin");
		double b1=test();
		
		System.out.println("main end"+b1);
	}
	public static double test()
	{

		System.out.println("from test");
		return 1.5;
	}
}

/*
D:\java-program-lab\method\app1\src>java -cp ../classes Z6
main begin
from test
main end1.5


*/
