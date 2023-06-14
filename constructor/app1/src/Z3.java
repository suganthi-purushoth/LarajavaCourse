class Z3
{
	static 
	{
		this();//not inside the static only constructor
		
	}
	Z3()
	{
		
	}
}
//this calling statement must be inside a constructor not inside any method or SIB block

/*
D:\java-program-lab\constructor\app1\src>javac -d ../classes Z3.java
Z3.java:5: error: call to this must be first statement in constructor
                this();
                    ^
1 error
*/
