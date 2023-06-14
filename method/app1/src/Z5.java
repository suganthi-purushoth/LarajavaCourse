class Z5
{
	public static void main(String[] args) 
	{
	
		System.out.println("main begin");
		byte b1=test();
		
		System.out.println("main end"+b1);
	}
	public static byte test()
	{

		System.out.println("from test");
		return 100;
	}
}

/*

D:\java-program-lab\method\app1\src>java -cp ../classes Z5
main begin
from test
main end100


*/
