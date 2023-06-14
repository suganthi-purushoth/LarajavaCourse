class  V
{
	public static void main(String[] args) 
	{
		System.out.println("from main");
	}
	public static int test()
	{
		System.out.println("from test");
		return false;
	}
}

/*
D:\java-program-lab\method\app1\src>javac -d ../classes V.java
V.java:10: error: incompatible types: boolean cannot be converted to int
                return false;
                       ^
1 error
*/