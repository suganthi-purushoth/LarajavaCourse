//32.find out 2nd max from a given int array?

class A32
{
	public static void main(String[] args) 
	{
		int[] array={1,5,2,6,9,1,0,3,4,5};
		//                0 1 2 3 4 5 6 7 8 9 
		
	int max1 =Integer.MIN_VALUE;
	int max2 =Integer.MIN_VALUE;
		  for(int i=0;i<array.length;i++)
		  {
			 if(array[i]>max1)
			  {
					max2=max1;
					max1=array[i];
			  }
			  else if(array[i]>max2)
			  {
				  max2=array[i];
		  }
		  }
		 	System.out.println("2nd max:"+max2);
	}
}

/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A32
2nd max:6
*/
