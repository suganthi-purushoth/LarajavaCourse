class K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("-------------");
		test2();
		System.out.println("main end");
		
		//stack overflowError
		
	}
	public static void test1()  //test1 test2 calling upto stack memory full

	{
		System.out.println("from test1 begin");
		test2();
		System.out.println("from test1 end");
	}
	public static void test2()
	{
		System.out.println("from test2 begin ");
		test1();
		System.out.println("from test2 end");		
	}
}
/*
from test2 begin
from test1 begin
from test2 begin
from test1 begin
from test2 begin
from test1 begin
from test2 begin
from test1 begin
from test2 begin
from test1 begin
from test2 begin
from test2 begin
Exception in thread "main" java.lang.StackOverflowError
        at java.base/java.io.BufferedWriter.flushBuffer(BufferedWriter.java:165)
        at java.base/java.io.PrintStream.implWriteln(PrintStream.java:848)
        at java.base/java.io.PrintStream.writeln(PrintStream.java:826)
        at java.base/java.io.PrintStream.println(PrintStream.java:1168)
        at K.test1(K.java:16)
        at K.test2(K.java:23)
        at K.test1(K.java:17)
*/