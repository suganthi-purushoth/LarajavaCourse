class G
{
	
	static int i=test1();
	static int j=test2();
	static
	{
		System.out.println("from SIB:"+i+ "," +j);
	}
	static int test1()
	{
		System.out.println("from test1:"+i+ ","+j);
		return 10;
	}
	static int test2()
	{
		System.out.println("from test2:"+i+" ,"+j);
		return 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("main:"+i+","+j);
	}
}
/*

D:\java-program-lab\static\app2\src>java -cp ../classes G
from test1:0,0
from test2:10 ,0
from SIB:10,20
main:10,20
*/