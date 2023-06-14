class Z23
{
	public static void main(String[] args) 
	{		
		System.out.println("main begin");
		test1(200,4.5);
		System.out.println("main end ");
	}
	public static void test1(int i,int j)
	{
		System.out.println("from test1"+i);
		
		}
}

/*
D:\java-program-lab\method\app1\src>javac -d ../classes Z23.java
Z23.java:6: error: incompatible types: possible lossy conversion from double to int
                test1(200,4.5);
                          ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error

*/
