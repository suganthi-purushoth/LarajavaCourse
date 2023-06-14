 class A 
{
	static void test()
	{
		System.out.println("from A.test");
	}

}
//executing the Q cls thr is no text(). here no clalling A cls
class Q
{		

	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
/*

D:\java-program-lab\static\app3\src>javac -d ../classes Q.java
Q.java:16: error: cannot find symbol
                test();
                ^
  symbol:   method test()
  location: class Q
1 error
*/

