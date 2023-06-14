//41.print the even elements which are in the middle of two odd elements
class A41 
{
		public static void main(String[] args)
	{
			int[] array={2,5,7,9,4,5,7,8,20,9};
			System.out.println("Even elements in the middle of two odd elements");
			for(int i=1;i<array.length-1;i++)
				if(array[i-1]%2!=0&&array[i+1]%2!=0 && array[i] %2==0)
		{
				System.out.println(array[i]+" ");
		}
	}
}

/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A41
Even elements in the middle of two odd elements
4
*/