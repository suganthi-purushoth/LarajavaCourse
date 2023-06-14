import java.util.Arrays;
class A54
{
	public static void main(String[] args) 
	{
		int[]array={10,5,13,16,4,7,20,18};
		System.out.println("initial:"+Arrays.toString(array));
		for (int i=0;i<array.length/2;i++ )
		{
		int temp=array[i];
		array[i]=array[array.length-1-i];
		array[array.length-1-i]=temp;
		}
		System.out.println("final:"+Arrays.toString(array));
	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A54
initial:[10, 5, 13, 16, 4, 7, 20, 18]
final:[18, 20, 7, 4, 16, 13, 5, 10]
*/