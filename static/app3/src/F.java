class F
{
	static int i=j;
	static int j;//direct read

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*

D:\java-program-lab\static\app3\src>javac -d ../classes F.java
F.java:3: error: illegal forward reference
        static int i=j;
                     ^
1 error
*/