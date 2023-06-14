//10.Create an integer array with 4 blocks. Store any number between 70 to 110 in the last position.Assign that element by creating a character array with 3 blocks and store the element in first position. Display both elements.
class A10 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[4];
		arr[4]=90;
		int[] arr1=new int[3];
		arr1[1]=arr[4];
		System.out.println("first array elements ="+arr[4]+"\n Second array element="+arr1[1]);
	}
}
