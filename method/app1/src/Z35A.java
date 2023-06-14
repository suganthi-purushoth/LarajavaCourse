class Z35A
{
	public static void main(String[] args) 
	{
			
		System.out.println("main begin");
		int i=1;
		test(i=i+20);
		System.out.println("main end "+i);
		
	}
	public static void test(int i)
	{
	
		System.out.println("from test"+i);
		i=30;
		}
}

/*
sD:\java-program-lab\method\app1\src>java -cp ../classes Z35
main begin
from test21
main end 21
*/