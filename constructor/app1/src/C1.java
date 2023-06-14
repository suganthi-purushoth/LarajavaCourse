class C1 
{
	int i;
	C()
	{
		System.out.println("C()");
		i=10;
	}
	static 
	{
	i=90;
	}

	
	public static void main(String[] args) 
	{
		C c1=new C();
		System.out.println("--------------");
		System.out.println(c1.i);
	}
}
/*

D:\java-program-lab\constructor\app1\src>javac -d ../classes C1.java
C1.java:4: error: invalid method declaration; return type required
        C()
        ^
1 error
*/