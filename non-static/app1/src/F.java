class F 
{
	void test1()
	{

	}
	static 
	{
		test1();
	}
}
/*

D:\java-program-lab\non-static\app1\src>javac -d ../classes F.java
F.java:9: error: non-static method test1() cannot be referenced from a static context
                test1();
                ^
1 error
*/
