class Z31
{
	public static void main(String[] args) 
	{		
		System.out.println("main begin");
		test1(10,false,30);
		System.out.println("main end ");
	}
	public static void test1(int i,boolean j,int k)
	{
	
		System.out.println("from test1"+i);
		System.out.println("from test1"+j);
		System.out.println("from test1"+k);
		
		}
}

/*

D:\java-program-lab\method\app1\src>java -cp ../classes Z31
main begin
from test110
from test1false
from test130
main end
*/
