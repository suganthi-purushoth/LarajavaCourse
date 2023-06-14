class Z36
{
	public static void main(String[] args) 
	{
			
		System.out.println("main begin");
		int x=1;
		test(x+20);
		System.out.println("main end "+x);
		
	}
	public static void test(int i)
	{
	
		System.out.println("from test"+i);
		i=30;
		}
}

/*

D:\java-program-lab\method\app1\src>java -cp ../classes Z36
main begin
from test21
main end 1
*/