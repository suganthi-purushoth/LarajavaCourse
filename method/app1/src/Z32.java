class Z32 
{
	public static void main(String[] args) 
	{
			
		System.out.println("main begin");
		int x=30;
		test(x);
		System.out.println("main end ");
	}
	public static void test(int i)
	{
	
		System.out.println("from test"+i);
		
		}
}

/*

D:\java-program-lab\method\app1\src>java -cp ../classes Z32
main begin
from test 30
main end

*/