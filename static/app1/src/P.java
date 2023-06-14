class P
{
	public static void main(String[] args) 
	{
		static int i;
		System.out.println("done");

	}
}

/*
D:\java-program-lab\static\app1\src>javac -d ../classes P.java
P.java:5: error: illegal start of expression
                static int i;
                ^
P.java:6: error: <identifier> expected
                System.out.println("done");
                                  ^
P.java:6: error: illegal start of type
                System.out.println("done");
                                   ^
P.java:9: error: class, interface, enum, or record expected
}
^
4 errors
*/
