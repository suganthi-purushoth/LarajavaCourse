class H 
{
	public static void main(String[] args) 
	{
	
		System.out.println("main ");
		
	}
	public static void test()
	{
		
		System.out.println("test:");
	}
	System.out.println("test");

}

/*

D:\java-program-lab\method\app1\src>javac -d ../classes H.java
H.java:14: error: <identifier> expected
        System.out.println("test");
                          ^
H.java:14: error: illegal start of type
        System.out.println("test");
                           ^
2 errors
*/