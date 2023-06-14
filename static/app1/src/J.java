class J
{
	
	public static void main(String[] args) 
	{
		int m=10;
		double m=4.5;
		System.out.println("done");
		
	}
}
/*

D:\java-program-lab\static\app1\src>javac -d ../classes J.java
J.java:7: error: variable m is already defined in method main(String[])
                double m=4.5;
                       ^
1 error

*/