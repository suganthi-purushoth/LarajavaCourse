import java.util.Scanner;
class F
{
	public static void main(String[] args) 
	{
		System.out.println("please enter one short value:");
		Scanner sc=new Scanner(System.in);
		short value=sc.nextShort();
		System.out.println("Short value is:"+value);
	}
}
//byte <short<int<long<float<double

/*

D:\java-program-lab\scanner-class\src>java -cp ../classes F
please enter one short value:
32767
Short value is:32767

D:\java-program-lab\scanner-class\src>java -cp ../classes F
please enter one short value:
32768
Exception in thread "main" java.util.InputMismatchException: Value out of range. Value:"32768" Radix:10
        at java.base/java.util.Scanner.nextShort(Scanner.java:2133)
        at java.base/java.util.Scanner.nextShort(Scanner.java:2081)
        at F.main(F.java:8)

D:\java-program-lab\scanner-class\src>java -cp ../classes F
please enter one short value:
-32768
Short value is:-32768

*/