class F 
{
	int i;
	F(int i)
	{
		i=10;
		System.out.println("F(int)");
	}
	public static void main(String[] args) 
	{
		F f1=new F();//no argument constructor not available
		System.out.println(f1.i);
	}
}
/*

D:\java-program-lab\constructor\app1\src>javac -d ../classes F.java
F.java:11: error: constructor F in class F cannot be applied to given types;
                F f1=new F();
                     ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error
*/