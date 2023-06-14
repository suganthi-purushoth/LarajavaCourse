class E 
{
	int i;//with out refernce var
	static
		{
		System.out.println(i);
	}
}
/*

D:\java-program-lab\non-static\app1\src>javac -d ../classes E.java
E.java:6: error: non-static variable i cannot be referenced from a static context
                System.out.println(i);
                                   ^
1 error
*/