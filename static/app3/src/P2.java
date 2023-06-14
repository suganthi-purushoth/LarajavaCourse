public class A 
{
	static int i;
}
class P2
{

	public static void main(String[] args) 
	{
		//System.out.println("main :"+ i);
		System.out.println("main :"+A.i);
	}
}
/*
D:\java-program-lab\static\app3\src>javac -d ../classes P2.java
P2.java:1: error: class A is public, should be declared in a file named A.java
public class A
       ^
1 error
`*/