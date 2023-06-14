class N 
{
	public static void main(String[] args) 
	{
		System.out.println("main!");
		return ;//its a keyword,not value
		System.out.println("main end");
	}
}

/*
D:\java-program-lab\method\app1\src>javac -d ../classes N.java
N.java:7: error: unreachable statement
                System.out.println("main end");
                ^
1 error

*/