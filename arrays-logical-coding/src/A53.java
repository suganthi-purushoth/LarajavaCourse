import java.util.Arrays;
class A53
{
	public static void main(String[] args) 
	{
		int[]array={10,5,13,16,4,7,20,18};
		System.out.println("initial:"+Arrays.toString(array));
		for (int i=0;i<array.length-1 ;i+=2 )
		{
		int temp=array[i];
		array[i]=array[i+1];
		array[i+1]=temp;
		}
		System.out.println("final:"+Arrays.toString(array));
	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A53
initial:[10, 5, 13, 16, 4, 7, 20, 18]
final:[5, 10, 16, 13, 7, 4, 18, 20]

*/