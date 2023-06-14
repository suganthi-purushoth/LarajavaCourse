class D 
{
	void test1()//non static test1 cannot refernce from static ()test2 without reference var
	{
		System.out.println("from test1");
	}
	static void test2()
	{
		test1();
		System.out.println("from test2");
	}
}
/*
D:\java-program-lab\non-static\app1\src>javac -d ../classes D.java
D.java:9: error: non-static method test1() cannot be referenced from a static context
                test1();
                ^
1 error
*/