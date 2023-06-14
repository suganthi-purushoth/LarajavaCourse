//37.print the elements which are next to even elements
class A37 
{
	public static void main(String[] args) 
	{
			int[] array={1,2,3,4,5,6,7,8,9,10};
				System.out.println("Elements next to even elements");
			for(int i=0;i<array.length-1;i++)
				if(array[i]%2==0)
		{
				System.out.println(array[i+1]+" ");
		}
	}
}
/*
D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A37
Elements next to even elements
3
5
7
9
*/