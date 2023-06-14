class Z7
{
	public static void main(String[] args) 
	{
	
		System.out.println("main begin");
		boolean b1=test();
		
		System.out.println("main end: "+b1);
	}
	public static boolean test()
	{

		System.out.println("from test");
		return true;
	}
}

/*

D:\java-program-lab\method\app1\src>java -cp ../classes Z7
main begin
from test
main end:true


*/
