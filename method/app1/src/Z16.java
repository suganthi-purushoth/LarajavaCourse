class Z16
{
	public static void main(String[] args) 
	{		
		System.out.println("main begin");
		test1();
		System.out.println("main end: ");
	}
	public static void test1(int i)
	{
		System.out.println("from test1");
		}
}

/*
D:\java-program-lab\method\app1\src>javac -d ../classes Z16.java
Z16.java:6: error: method test1 in class Z16 cannot be applied to given types;
                test1();
                ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error
*/
