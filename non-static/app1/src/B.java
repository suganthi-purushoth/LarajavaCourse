class B 
{
	void test()
	{
	}
	public static void main(String[] args) 
	{
		test();//non static
		System.out.println("done");
	}
}

/*

D:\java-program-lab\non-static\app1\src>javac -d ../classes B.java
B.java:8: error: non-static method test() cannot be referenced from a static context
                test();
                ^
1 error
*/