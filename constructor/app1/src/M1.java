class M1
{
	M()
	{
		System.out.println("M()");
	}
	
	public static void main(String[] args) 
	{
		M m1=new M(10);
		System.out.println("------------");
		M m2=new M();
		System.out.println("------------");
	}
}
/*

D:\java-program-lab\constructor\app1\src>javac -d ../classes M1.java
M1.java:3: error: invalid method declaration; return type required
        M()
        ^
1 error

*/