//29.find out max value from all even elements from a given int array?

class A29
{
	public static void main(String[] args) 
	{
		int[] array={1,5,2,6,9,1,0,3,4,5};
		//                0 1 2 3 4 5 6 7 8 9 
		
	int max =Integer.MIN_VALUE;
		  for(int i=0;i<array.length;i++)
		  {
			 if(array[i]%2==0&&  array[i]>max)
			  {
				 max=array[i];
			  }
		  }
		 	System.out.println("max:"+max);
	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A29
max:6
*/