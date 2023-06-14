 class A 
{
	static int i;
}
class P4
{

	public static void main(String[] args) 
	{
		System.out.println("main :"+ i);
		System.out.println("main :"+A.i);
	}
}
/*

D:\java-program-lab\static\app3\src>javac -d ../classes P4.java
P4.java:10: error: cannot find symbol
                System.out.println("main :"+ i);
                                             ^
  symbol:   variable i
  location: class P4
1 error
`*/

//in java file max 0,1 only one public class is available
//the class name must be a public

