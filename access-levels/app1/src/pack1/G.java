package pack1;
class F 
{
	private static int i=90;
	static void test()
	{
		System.out.println(i);
	}
}
class G
{
	public static void main(String[] args) 
	{
	    System.out.println(F.i);
		F.test();
		}
}
//private-static legal combinations
/*
D:\java-program-lab\access-levels\app1\src>javac -d ../classes pack1/G.java
pack1\G.java:14: error: i has private access in F
                System.out.println(F.i);
                                    ^
1 error*/