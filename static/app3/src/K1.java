class K1
{
	static
	{
		System.out.println(i);
	}
	static void test()
	{
		System.out.println(i);
	}
	static
	{
		test();
	}
	static int i;
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*

D:\java-program-lab\static\app3\src>javac -d ../classes K1.java
K1.java:5: error: illegal forward reference
                System.out.println(i);
                                   ^
1 error
*/