
//5.read all the elements from a given array?

class A5
{
	public static void main(String[] args) 
	{
		int[] array={1,5,2,6,9,1,0,3,4,5};
		//                0 1 2 3 4 5 6 7 8 9 
		
		//1st approach
		//for(int i=0;i<array.length;i++)
		//{
		//	System.out.println(array[i]);//array containg index number.. index number always starting from 0
		//}
		
		
		//2nd approach
		
			
			for(int i:array)
			{
				System.out.println(i);
		}
	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A5
1
5
2
6
9
1
0
3
4
5

*/