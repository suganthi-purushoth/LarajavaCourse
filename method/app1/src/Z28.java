class Z28
{
	public static void main(String[] args) 
	{		
		System.out.println("main begin");
		
		System.out.println("main end ");
	}
	public static void test1(int i)
	{
		double i;
		System.out.println("from test1");
		
		}
}

/*

D:\java-program-lab\method\app1\src>javac -d ../classes Z28.java
Z28.java:11: error: variable i is already defined in method test1(int)
                double i;
                       ^
1 error

*/
