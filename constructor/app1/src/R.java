class R 
{
	R()
	{
		System.out.println("R()");
	}
	R(int i)
	{
		System.out.println("R(int)");
		this();//always 1st statement in constructor body
	}

	public static void main(String[] args) 
	{
		R r1=new R();
		System.out.println("-------------");
		R r2=new R(20);
		System.out.println("-------------");
	}
}
/*
D:\java-program-lab\constructor\app1\src>javac -d ../classes R.java
R.java:10: error: call to this must be first statement in constructor
                this();
                    ^
1 error
*/