class M3
{
	//IIB(Instance Initialization block)
	//this will be executed while objects are created before the execution of constutor.
	//non static block
	{
		System.out.println(i);//IIB(Instance Initialization block)
	}
	int i;

	public static void main(String[] args) 
	{
		M3 m3=new M3();
	}
		
}
//illegal forward reference applies to non static variable also.
/*

D:\java-program-lab\non-static\app1\src>javac -d ../classes M3.java
M3.java:5: error: illegal forward reference
                System.out.println(i);
                                   ^
1 error
*/