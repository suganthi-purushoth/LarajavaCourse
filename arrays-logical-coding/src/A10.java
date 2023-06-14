//10.read all the elements inthe reverse order but expect first and last from a given array?
class A10
{
	public static void main(String[] args) 
	{
		int[] array={1,5,2,6,9,1,0,3,4,5};
		//                0 1 2 3 4 5 6 7 8 9 
		
		//1st approach
		  for(int i=array.length-2;i>=1;i--)
		  {
		 	System.out.println(array[i]);//array containg index number.. index number always starting from 0
		   }
		
		
	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A10
4
3
0
1
9
6
2
5

*/