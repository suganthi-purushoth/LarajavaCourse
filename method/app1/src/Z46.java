class Z46
{
	public static void main(String[] args) 
	{
			
		System.out.println("main begin");
		int i=1;
		int j=	test(++i);
		System.out.println("main end "+i+ "," +j);  
		
	}
	public static int test(int i)
	{
	
		System.out.println("from test"+i);
		return ++i;
		}
}

/*

D:\java-program-lab\method\app1\src>java -cp ../classes Z46
main begin
from test2
main end 2,3
*/