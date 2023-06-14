class Z20
{
	public static void main(String[] args) 
	{		
		System.out.println("main begin");
		test1(200);
		System.out.println("main end "+i);
	}
	public static void test1(int i)
	{
		System.out.println("from test1"+i);
		}
}

/*
D:\java-program-lab\method\app1\src>javac -d ../classes Z20.java
Z20.java:7: error: cannot find symbol
                System.out.println("main end "+i);
                                               ^
  symbol:   variable i
  location: class Z20
1 error

*/
