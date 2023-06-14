class Z37
{
	public static void main(String[] args) 
	{
			
		System.out.println("main begin");
		int i=1;
		test(i++);
		System.out.println("main end "+i);
		
	}
	public static void test(int i)
	{
	
		System.out.println("from test"+i);
		i=30;
		}
}

/*
D:\java-program-lab\method\app1\src>java -cp ../classes Z37
main begin
from test1
main end 2
*/