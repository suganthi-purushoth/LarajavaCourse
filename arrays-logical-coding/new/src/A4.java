//Define an integer array with 5 blocks. store 27 in the last location and display the same.

class A4
{
	public static void main(String[] args) 
	{
		int[] arr=new int [5];
		arr[4]=27;
		System.out.println(arr[4]);
	}
}
/*
D:\java-program-lab\arrays-logical-coding\new\src>java -cp ../classes A4
27
*/