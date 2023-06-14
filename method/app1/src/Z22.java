class Z22
{
	public static void main(String[] args) 
	{		
		System.out.println("main begin");
		test1(200);
		System.out.println("main end ");
	}
	public static void test1(int i,int j)
	{
		System.out.println("from test1"+i);
		
		}
}

/*
D:\java-program-lab\method\app1\src>javac -d ../classes Z22.java
Z22.java:6: error: method test1 in class Z22 cannot be applied to given types;
                test1(200);
                ^
  required: int,int
  found:    int
  reason: actual and formal argument lists differ in length
1 error


*/
