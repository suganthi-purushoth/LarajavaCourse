class Z2
{
	public static void main(String[] args) 
	{
	
		System.out.println("main begin");
		
		System.out.println("in the main:"+test());
		System.out.println("main end");
	}
	public static void test()
	{

		System.out.println("from test");
		
	}
}

/*



D:\java-program-lab\method\app1\src>javac -d ../classes Z2.java
Z2.java:8: error: 'void' type not allowed here
                System.out.println("in the main:"+test());
                                                      ^
1 error

*/
