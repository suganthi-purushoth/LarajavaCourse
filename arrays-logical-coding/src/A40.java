//40.print the odd elements which are in the middle of two even elements
class  A40
{
	public static void main(String[] args) 
	{		
				int[] array = {1,5,7,2,7,4,6,9,2,6,4,0, 9};
		System.out.println("odd Elements  in the middle of two  even elements");
		 for (int i =1; i < array.length-1; i++)
		  if (array[i-1] % 2 == 0 && array[i+1] % 2 == 0&&array[i]%2!=0) 
			 {
                System.out.print(array[i] + " ");
			 }
	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A40
odd Elements  in the middle of two  even elements
7 9
*/