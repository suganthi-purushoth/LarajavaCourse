//3.read last 3 elements from a given array?
class B3 
{
	public static void main(String[] args) 
	{
		int[] array={1,5,2,6,9,1,0,3,4,5,12};
		//                0 1 2 3 4 5 6 7 8 9 
		
		//one approach
		System.out.println(array[8]);//array containg index number.. index number always starting from 0
		System.out.println(array[9]);
		System.out.println(array[10]);
		//2nd approach
		//System.out.println(array[array.length-3]);
		//System.out.println(array[array.length-2]);
		//System.out.println(array[array.length-1]);
	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes B3
4
5
12
*/