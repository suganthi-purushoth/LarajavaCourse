class Z24
{
	public static void main(String[] args) 
	{		
		System.out.println("main begin");
		test1(200,4);
		System.out.println("main end ");
	}
	public static void test1(int i,int j)
	{
		System.out.println("from test1"+i);
		
		}
}

/*
D:\java-program-lab\method\app1\src>java -cp ../classes Z24
main begin
from test1200
main end
*/
