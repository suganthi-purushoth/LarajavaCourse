//14.read alternative  elements from a given array in the reverse order?



class B14
{
	public static void main(String[] args) 
	{
		int[] array={1,5,2,6,9,1,0,3,4,5,12};
		//                0 1 2 3 4 5 6 7 8 9 
		
		//1st approach
		  for(int i=array.length-1;i>=0;i-=2)
		  {
		 	System.out.println(array[i]);//array containg index number.. index number always starting from 0
		   }
		

	}
}
/*


D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes B14
12
4
0
9
2
1
*/