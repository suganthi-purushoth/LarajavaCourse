class Z27
{
	public static void main(String[] args) 
	{		
		System.out.println("main begin");
		
		System.out.println("main end ");
	}
	public static void test1(int i,double i)
	{
		System.out.println("from test1");
		
		}
}

/*
D:\java-program-lab\method\app1\src>javac -d ../classes Z27.java
Z27.java:9: error: variable i is already defined in method test1
        public static void test1(int i,double i)
                                              ^
1 error

*/
