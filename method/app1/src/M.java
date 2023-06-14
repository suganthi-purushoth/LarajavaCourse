class M 
{
	public static void main(String[] args) 
	{
		System.out.println("main!");
		return 200;//its a keyword,not value
	}
}
/*

D:\java-program-lab\method\app1\src>javac -d ../classes M.java
M.java:6: error: incompatible types: unexpected return value
                return 200;
                       ^
1 error
*/