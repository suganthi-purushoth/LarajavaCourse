import java.util.Scanner;
class G
{
	public static void main(String[] args) 
	{
		System.out.println("please enter one long value:");
		Scanner sc=new Scanner(System.in);
		long value=sc.nextLong();
		System.out.println("Long value is:"+value);
	}
}
//byte <short<int<long<float<double

/*
D:\java-program-lab\scanner-class\src>java -cp ../classes G
please enter one long value:
-92233720368
Long value is:-92233720368

*/