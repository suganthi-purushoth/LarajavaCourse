//64.left rotate by two.
//example:initial {10,5,13,16,4,7,20,18}
 //        final {20,18,10,5,13,16,4,7}

import java.util.Arrays;
class A64
{
	public static void main(String[] args) 
	{
		
		int[]array={10,5,13,16,4,7,20,18};
		System.out.println("initial:"+Arrays.toString(array));
		int temp1=array[array.length-1];
		int temp2=array[array.length-2];
		for (int i=array.length-1;i>1;i--)
		{
		  array[i]=array[i-2];
		}
		array[0]=temp2;
		array[1]=temp1;
		System.out.println("final:"+Arrays.toString(array));
		}

}
/*
D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A64
initial:[10, 5, 13, 16, 4, 7, 20, 18]
final:[20, 18, 10, 5, 13, 16, 4, 7]


*/