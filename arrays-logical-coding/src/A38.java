//38.print the elements which are prev to even elements
class A38
{
	public static void main(String[] args) 
	{		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Elements prev to even elements");
		 for (int i = 1; i <= array.length; i++)
		  if (array[i] % 2 == 0) 
			 {
                System.out.print(array[i-1] + " ");
			 }
	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A38
Elements next to even elements
1 3 5 7 9
*/