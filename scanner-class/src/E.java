import java.util.Scanner;
class E
{
	public static void main(String[] args) 
	{
		System.out.println("please enter one byte value:");
		Scanner sc=new Scanner(System.in);
		byte value=sc.nextByte();
		System.out.println("Byte value is:"+value);
	}
}
//byte <short<int<long<float<double

/*
D:\java-program-lab\scanner-class\src>java -cp ../classes E
please enter one byte value:
127
Byte value is:127

D:\java-program-lab\scanner-class\src>java -cp ../classes E
please enter one byte value:
128
Exception in thread "main" java.util.InputMismatchException: Value out of range. Value:"128" Radix:10
        at java.base/java.util.Scanner.nextByte(Scanner.java:2017)
        at java.base/java.util.Scanner.nextByte(Scanner.java:1965)
        at E.main(E.java:8)

*/