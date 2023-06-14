//34.find out 3rd max from a given int array?


class A34
{
	public static void main(String[] args) 
	{
		int[] array={1,7,2,6,9,1,0,3,4,5};
		//                0 1 2 3 4 5 6 7 8 9 
		
	int max1 =Integer.MIN_VALUE;
	int max2 =Integer.MIN_VALUE;
	int max3 =Integer.MIN_VALUE;
		  for(int i=0;i<array.length;i++)
		  {
			 if(array[i]>max1)
			  {		
				 	max3=max2;
					max2=max1;
					max1=array[i];
			  }
			  else if(array[i]>max2)
			  {
				  max2=array[i];
		  }
			  else if(array[i]>max3)
			  {
				  max3=array[i];
		  }
		  }
		 	System.out.println("3rd max:"+max3);
	}
}

/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A34
3rd max:6
*/
