class  C
{
	int i;//non static var i,referening to using using static ()
	static void test()
	{
		System.out.println(i);
	}
}
/*

D:\java-program-lab\non-static\app1\src>javac -d ../classes C.java
C.java:6: error: non-static variable i cannot be referenced from a static context
                System.out.println(i);
                                   ^
1 error

*/