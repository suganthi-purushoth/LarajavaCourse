//11.read first halfof the elements from a given array in the reverse order?

class B11
{
	public static void main(String[] args) 
	{
		int[] array={1,5,2,6,9,1,0,3,4,5,12};
		//                0 1 2 3 4 5 6 7 8 9 
		
		//1st approach
		  for(int i=(array.length-1)/2;i>=0;i--)
		  {
		 	System.out.println(array[i]);//array containg index number.. index number always starting from 0
		   }
		

	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes B11
1
9
6
2
5
1

*/