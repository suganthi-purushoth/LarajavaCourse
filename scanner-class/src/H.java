import java.util.Scanner;
class H
{
	public static void main(String[] args) 
	{
		System.out.println("please enter three int value:");
		Scanner sc=new Scanner(System.in);
		int value1=sc.nextInt();
		int value2=sc.nextInt();
		int value3=sc.nextInt();
		System.out.println("addition of three int values is:"+(value1+value2+value3));
	}
}
//byte <short<int<long<float<double

/*

D:\java-program-lab\scanner-class\src>java -cp ../classes H
please enter three int value:
45
34
78
addition of three int values is:157

*/