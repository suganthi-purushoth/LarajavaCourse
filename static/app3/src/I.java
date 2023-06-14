class I
{
	static
	{
		System.out.println(i);
	}
	static int i;
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*

D:\java-program-lab\static\app3\src>javac -d ../classes I.java
I.java:5: error: illegal forward reference
                System.out.println(i);
                                   ^
1 error*/