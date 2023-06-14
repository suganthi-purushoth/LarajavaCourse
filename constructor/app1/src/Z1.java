class Z1 
{
	Z1()
	{
		this(10);
		this(10);
	}
	Z1(int i,int j)
	{
		
	}
}
/*

D:\java-program-lab\constructor\app1\src>javac -d ../classes Z1.java
Z1.java:5: error: no suitable constructor found for Z1(int)
                this(10);
                ^
    constructor Z1.Z1() is not applicable
      (actual and formal argument lists differ in length)
    constructor Z1.Z1(int,int) is not applicable
      (actual and formal argument lists differ in length)
Z1.java:6: error: call to this must be first statement in constructor
                this(10);
                    ^
Z1.java:6: error: no suitable constructor found for Z1(int)
                this(10);
                ^
    constructor Z1.Z1() is not applicable
      (actual and formal argument lists differ in length)
    constructor Z1.Z1(int,int) is not applicable
      (actual and formal argument lists differ in length)
3 errors
/*