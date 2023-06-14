class Z
{
	public static void main(String[] args) 
	{
	
		System.out.println("main begin");
		boolean i=test();
		System.out.println("in the main:"+i);
		System.out.println("main end");
	}
	public static int test()
	{

		System.out.println("from test");
		return 100;
	}
}

/*


D:\java-program-lab\method\app1\src>javac -d ../classes Z.java
Z.java:7: error: incompatible types: int cannot be converted to boolean
                boolean i=test();
                              ^
1 error

*/
