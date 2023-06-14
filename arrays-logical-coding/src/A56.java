//56.replace array elements with the twice index numbers.
//example:initial {10,5,13,16,4,7,20,18}
 //        final{0,2,4,6,8,10,12,14}
import java.util.Arrays;
class A56
{
	public static void main(String[] args) 
	{
		int[]array={10,5,13,16,4,7,20,18};
		System.out.println("initial:"+Arrays.toString(array));
		for (int i=0;i<array.length;i++ )
		{
		  array[i]=2*i;
		}
		System.out.println("final:"+Arrays.toString(array));
	}
}/*
D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A56
initial:[10, 5, 13, 16, 4, 7, 20, 18]
final:[0, 2, 4, 6, 8, 10, 12, 14]
*/