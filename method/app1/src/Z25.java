class Z25
{
	public static void main(String[] args) 
	{		
		System.out.println("main begin");
		test1(200,4);
		System.out.println("main end ");
	}
	public static void test1(int i,int j)
	{
		System.out.println("from test1"+i+","+j);
		
		}
}

/*

D:\java-program-lab\method\app1\src>javac -d ../classes Z25.java

D:\java-program-lab\method\app1\src>java -cp ../classes Z25
main begin
from test1200,4
main end
*/
