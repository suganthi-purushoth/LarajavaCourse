class Z40
{
	public static void main(String[] args) 
	{
			
		System.out.println("main begin");
		int i=1;
		test(i++ + i++   +  i  +  i++);
		//i  = 1   +  2     +   3  +  3
		System.out.println("main end "+i);  //i  =  4 
		
	}
	public static void test(int i)
	{
	
		System.out.println("from test"+i);
		i=30;
		}
}

/*

D:\java-program-lab\method\app1\src>java -cp ../classes Z40
main begin
from test9
main end 4
*/