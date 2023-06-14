import java.util.*;
class A2 
{
	public static void main(String[] args) 
	{
		byte [] array = new byte[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st nmber");
		array[1] = scanner.nextByte();
		System.out.println("Enter 2nd nmber");
		array[2] = scanner.nextByte();
		int sum = array[1] + array[2] ;
		System.out.println("Sum is: " + sum);
	}
}
