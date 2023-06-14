//9.Create a byte array with 6 blocks. Store any number between -128 to +127 in the mid+1 position. Assign the element by creating an integer array with 7 blocks and store the element in the mid -1 position in an integer array. Display both the elements.
class A9
{
	public static void main(String[] args) 
	{
		byte[] b=new byte[6];
	    int[] arr=new int[7];
		b[3]=-65;
		arr[2]=b[3];
		System.out.println("Byte array elements= "+b[3]+"\n Integer array elements="+arr[2]);
	}
}
//byte[]b=new byte[6];
/*
D:\java-program-lab\arrays-logical-coding\new\src>java -cp ../classes A9
Byte array elements= -65
 Integer array elements=-65*/