//4.read middle two elements from a given array?
(assume total 10 elements are available in an array)
class A4 
{
	public static void main(String[] args) 
	{
		int[] array={1,5,2,6,9,1,0,3,4,5};
		//                0 1 2 3 4 5 6 7 8 9 
		
		//one approach
		System.out.println(array[4]);//array containg index number.. index number always starting from 0
		System.out.println(array[5]);

		//2nd approach

		System.out.println(array[(array.length/2)-1]);
		System.out.println(array[(array.length/2)]);
	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A4
9
1


9
1
*/