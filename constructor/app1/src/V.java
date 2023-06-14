class V 
{
	V()
	
	{
		this();
		System.out.println("V()");
	}
}
/*

D:\java-program-lab\constructor\app1\src>javac -d ../classes V.java
V.java:6: error: recursive constructor invocation
                this();
                ^
1 error

*/