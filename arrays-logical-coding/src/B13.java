//13.read alternative  elements from a given array ?
class B13
{
	public static void main(String[] args) 
	{
		int[] array={1,5,2,6,9,1,0,3,4,5,12};
		//                0 1 2 3 4 5 6 7 8 9 
		
		//1st approach
		  for(int i=0;i<array.length;i+=2)
		  {
		 	System.out.println(array[i]);//array containg index number.. index number always starting from 0
		   }
		

	}
}
/*
D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes B13
1
2
9
0
4
12
*/