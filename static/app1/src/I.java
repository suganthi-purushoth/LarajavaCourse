class I
{
	static int m;
	static double m;
	public static void main(String[] args) 
	{
		System.out.println("done");
		
	}
}
/*

D:\java-program-lab\static\app1\src>javac -d ../classes I.java
I.java:4: error: variable m is already defined in class I
        static double m;
                      ^
1 error

*/