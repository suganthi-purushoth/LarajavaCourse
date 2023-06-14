class M 
{
	M(int  i)
	{
		System.out.println("M(int)");
	}
	//default constructor not given 
	public static void main(String[] args) 
	{
		M m1=new M(10);
		System.out.println("------------");
		M m2=new M();
		System.out.println("------------");
	}
}
/*
D:\java-program-lab\constructor\app1\src>javac -d ../classes M.java
M.java:11: error: constructor M in class M cannot be applied to given types;
                M m2=new M();
                     ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error

*/