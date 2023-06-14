class Z9
{
	public static void main(String[] args) 
	{
	
		System.out.println("main begin");
		int b1=test();
		
		System.out.println("main end: "+b1);
	}
	public static int test()
	{

		System.out.println("from test");
		int i;
		return i;
	}
}

/*
D:\java-program-lab\method\app1\src>javac -d ../classes Z9.java
Z9.java:16: error: variable i might not have been initialized
                return i;
                       ^
1 error
*/
