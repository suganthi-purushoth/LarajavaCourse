//55.replace array elements with the index numbers.
//example:initial {10,5,13,16,4,7,20,18}
//         final{0,1,2,3,4,5,6,7}

import java.util.Arrays;
class A55
{
	public static void main(String[] args) 
	{
		int[]array={10,5,13,16,4,7,20,18};
		System.out.println("initial:"+Arrays.toString(array));
		for (int i=0;i<array.length;i++ )
		{
		  array[i]=i;
		}
		System.out.println("final:"+Arrays.toString(array));
	}
}/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A55
initial:[10, 5, 13, 16, 4, 7, 20, 18]
final:[0, 1, 2, 3, 4, 5, 6, 7]
*/