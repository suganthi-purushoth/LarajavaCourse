public class A 
{
	static int i;
}
public class P3
{

	public static void main(String[] args) 
	{
		//System.out.println("main :"+ i);
		System.out.println("main :"+A.i);
	}
}
/*

D:\java-program-lab\static\app3\src>javac -d ../classes P3.java
P3.java:1: error: class A is public, should be declared in a file named A.java
public class A
       ^
1 error
`*/

//in java file max 0,1 only one public class is available
//the class name must be a public

