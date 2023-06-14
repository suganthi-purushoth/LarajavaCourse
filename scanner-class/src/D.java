import java.util.Scanner;
class D
{
	public static void main(String[] args) 
	{
		//float f1=20.0F;//this value compiler consider as a double
		//float can be fully compartable with double
		//double d1=29.0F
		System.out.println("please enter one double value:");
		Scanner sc=new Scanner(System.in);
		double value=sc.nextDouble();
		System.out.println("Double value is:"+value);
	}
}
//byte <short<int<long<float<double

/*D:\java-program-lab\scanner-class\src>java -cp ../classes D
please enter one double name:
2.4
Double value is:2.4


D:\java-program-lab\scanner-class\src>java -cp ../classes D
please enter one double value:
23 ------------->23 upcasting to double
Double value is:23.0
*/