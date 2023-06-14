class ZZ31
{
	public static void main(String[] args) 
	{		
		System.out.println("main begin");
		int x;
		test(x);
		System.out.println("main end ");
	}
	public static void test(int i)
	{
	
		System.out.println("from test1"+i);
		
		}
}

/*


D:\java-program-lab\method\app1\src>javac -d ../classes  ZZ31.java
ZZ31.java:7: error: variable x might not have been initialized
                test(x);
                     ^
1 error

*/
