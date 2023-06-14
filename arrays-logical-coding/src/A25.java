//25.find out max value in the first half from a given int array?
class A25
{
	public static void main(String[] args) 
	{
		int[] array={1,5,2,6,9,1,0,3,4,5};
		//                0 1 2 3 4 5 6 7 8 9 
		
	int max =Integer.MIN_VALUE;
		  for(int i=0;i<array.length/2;i++)
		  {
			 if(array[i]>max)
			  {
				 max=array[i];
			  }
		  }
		 	System.out.println("max:"+max);
	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A25
max:9

*/