class Z2
{
	Z2()
	{
		this(10,20);
		this(10,20);
	}
	Z2(int i,int j)
	{
		
	}
}
/*

D:\java-program-lab\constructor\app1\src>javac -d ../classes Z2.java
Z2.java:6: error: call to this must be first statement in constructor
                this(10,20);
                    ^
1 error

*/
