//12.read last half of the elements from a given array in the reverse order?(assume total 10 elements are available in an array)


class A12
{
	public static void main(String[] args) 
	{
		int[] array={1,5,2,6,9,1,0,3,4,5};
		//                0 1 2 3 4 5 6 7 8 9 
		
		//1st approach
		  for(int i=array.length-1;i>=array.length/2;i--)
		  {
		 	System.out.println(array[i]);//array containg index number.. index number always starting from 0
		   }
		

	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A12
5
4
3
0
1

*/