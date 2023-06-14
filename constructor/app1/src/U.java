class U
{
	
	U()
	{
		this(10);
		System.out.println("U()");
	}
	U(int i)
	{
		this();
		System.out.println("U(int)");
		
	}

	public static void main(String[] args) 
	{
		U u1=new U();
		System.out.println("-------------");
		U u2=new U(10);
		System.out.println("-------------");
	}
}
/*

D:\java-program-lab\constructor\app1\src>javac -d ../classes U.java
U.java:11: error: recursive constructor invocation
                this();
                ^
1 error


*/