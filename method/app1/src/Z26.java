class Z26
{
	public static void main(String[] args) 
	{		
		System.out.println("main begin");
		
		System.out.println("main end ");
	}
	public static void test1(int i,int i)
	{
		System.out.println("from test1");
		
		}
}

/*

D:\java-program-lab\method\app1\src>javac -d ../classes Z26.java
Z26.java:9: error: variable i is already defined in method test1
        public static void test1(int i,int i)
                                           ^
1 error

*/
