class Z49
{
	public static void main(String[] args) 
	{
			
		System.out.println("main begin");
		int i=1;
		int j=	test(++i)  +  i;//j  =  3   +(i  =  2)  =5
		System.out.println("main end "+i+ "," +j);  
		
	}
	public static int test(int i)
	{
	
		System.out.println("from test"+i);
		return ++i;//(  i  =2  became 3)
		}
}

/*
D:\java-program-lab\method\app1\src>java -cp ../classes Z49
main begin
from test2
main end 2,5
*/