import java.util.Arrays;
class A52 
{
	public static void main(String[] args) 
	{
		int[]array={10,5,13,16,4,7,20,18};
		System.out.println("initial:"+Arrays.toString(array));
		int temp=array[0];
		array[0]=array[array.length-1];
		array[array.length-1]=temp;
		System.out.println("final:"+Arrays.toString(array));	
	}
}

/*
D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A52
initial:[10, 5, 13, 16, 4, 7, 20, 18]
final:[18, 5, 13, 16, 4, 7, 20, 10]

*/
