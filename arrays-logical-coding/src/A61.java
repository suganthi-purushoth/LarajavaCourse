//61.right shift by one.
//example:initial {10,5,13,16,4,7,20,18}
  //       final {10,10,5,13,16,4,7,20}
import java.util.Arrays;
class A61
{
	public static void main(String[] args) 
	{
		{
		int[]array={10,5,13,16,4,7,20,18};
		System.out.println("initial:"+Arrays.toString(array));
		for (int i=array.length-1;i>0;i-- )
		{

		  array[i]=array[i-1];
		}
		System.out.println("final:"+Arrays.toString(array));
		}
}
}
/*


D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A61
initial:[10, 5, 13, 16, 4, 7, 20, 18]
final:[10, 10, 5, 13, 16, 4, 7, 20]
*/