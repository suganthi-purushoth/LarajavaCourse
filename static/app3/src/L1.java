class L1
{
	static int test()
	{
		return j;
	}

	static int i=test1();
	
	static int j=10;
	
	static int test2()
	{
		return i=90;
	}
	public static void main(String[] args) 
	{
		System.out.println(i+ " , " +j);
	}
}
/*

D:\java-program-lab\static\app3\src>javac -d ../classes L1.java
L1.java:8: error: cannot find symbol
        static int i=test1();
                     ^
  symbol:   method test1()
  location: class L1
1 error
*/