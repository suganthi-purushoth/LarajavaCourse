class J
{
	static
	{
		System.out.println(J.i);//indirect reference
		System.out.println(i);//direct reference
	}
	static int i;
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*
D:\java-program-lab\static\app3\src>javac -d ../classes J.java
J.java:6: error: illegal forward reference
                System.out.println(i);//direct reference
                                   ^
1 error
*/