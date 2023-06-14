//5.Define an integer array with 10 blocks. Store 200 in the last location and store 34 in the last but one location and display both the elements.
import java.util.*;
class A5
{
	public static void main(String[] args) 
	{
		int [] arr=new int [10];
		arr[9]=200;
		arr[8]=34;
		System.out.println(arr[9]+" "+ arr[8]);
	}
}
