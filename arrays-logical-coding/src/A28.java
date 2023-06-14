//28.find out min value from all even elements from a given int array?

class A28
{
	public static void main(String[] args) 
	{
		int[] array={1,5,2,6,9,1,0,3,4,5};
		//                0 1 2 3 4 5 6 7 8 9 
		
	int min =Integer.MAX_VALUE;
		  for(int i=0;i<array.length;i++)
		  {
			 if(array[i]%2==0&&  array[i]<min)
			  {
				 min=array[i];
			  }
		  }
		 	System.out.println("min:"+min);
	}
}
/*
D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A28
min:0

*/