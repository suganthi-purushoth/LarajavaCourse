//35.find out 3rd min value from  a given int array?

class A35
{
	public static void main(String[] args) 
	{
		int[] array={1,5,2,6,9,1,0,3,4,5};
		//                0 1 2 3 4 5 6 7 8 9 
		
		int min1 =Integer.MAX_VALUE;
		int min2 =Integer.MAX_VALUE;
		int min3 =Integer.MAX_VALUE;
		  for(int i=0;i<array.length;i++)
		  {
			 if(array[i]<min1)
			  {
				 min3=min2;
				 min2=min1;
				 min1=array[i];
			  }
			  
			  else if (array[i]<min2)
			  {
				  min2=array[i];
			  }
			  
			  else if (array[i]<min3)
			  {
				  min3=array[i];
			  }
		  }
		 	System.out.println("3rd min:"+min3);
	}
}
/*


D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A35
3rd min:3
*/