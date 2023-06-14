//39.print the elements which are in the middle of two even elements
class  A39
{
	public static void main(String[]args)
	{
		    int[] array = {2,7,4,1,0,5,3,7,6, 9};
		    System.out.println("Elements  in the middle of two  even elements");
		     for (int i =1; i < array.length-1; i++)
					if (array[i-1] % 2 == 0 && array[i+1] % 2 == 0) 
						 {
						   System.out.print(array[i] + " ");
          				  }
	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A39
Elements  in the middle of two  even elements
3 5 7
*/                          