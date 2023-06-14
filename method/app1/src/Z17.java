class Z17
{
	public static void main(String[] args) 
	{		
		System.out.println("main begin");
		test1(true);// boolean can not be converted in to int
		System.out.println("main end: ");
	}
	public static void test1(int i)
	{
		System.out.println("from test1");
		}
}

/*

D:\java-program-lab\method\app1\src>javac -d ../classes Z17.java
Z17.java:6: error: incompatible types: boolean cannot be converted to int
                test1(true);
                      ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
*/
