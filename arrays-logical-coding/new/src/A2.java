import java.util.*;
class A2 
{
	public static void main(String[] args) 
	{
		byte[] arr = new byte[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		arr[1]= sc. nextByte();
		System.out.println("Enter the second number:");
		arr[2]=sc.nextByte();

		byte sum=(byte)(arr[1]+arr[2]);
		System.out.println("sum: "+ sum);

	}
}
