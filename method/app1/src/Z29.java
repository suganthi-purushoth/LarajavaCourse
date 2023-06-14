class Z29
{
	public static void main(String[] args) 
	{		
		System.out.println("main begin");
		test1(10,20,30);
		System.out.println("main end ");
	}
	public static void test1(int i,boolean j,int k)
	{
	
		System.out.println("from test1");
		
		}
}

/*
D:\java-program-lab\method\app1\src>javac -d ../classes Z29.java
Z29.java:6: error: incompatible types: int cannot be converted to boolean
                test1(10,20,30);
                         ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
*/
