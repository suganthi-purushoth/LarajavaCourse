//60.left rotates by two.
//example:initial {10,5,13,16,4,7,20,18}
 //final {13,16,4,7,20,18,10,5}

import java.util.Arrays;
class A60
{
	public static void main(String[] args) 
	{
		{
		int[]array={10,5,13,16,4,7,20,18};
		System.out.println("initial:"+Arrays.toString(array));
		int temp0=array[0];
		int temp1=array[1];
		for (int i=0;i<array.length-2;i++ )
		{
		  array[i]=array[i+2];
		}
		array[array.length-1]=temp1;
		array[array.length-2]=temp0;
		System.out.println("final:"+Arrays.toString(array));
		}
}
}
/*
D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A60
initial:[10, 5, 13, 16, 4, 7, 20, 18]
final:[13, 16, 4, 7, 20, 18, 10, 5]

*/