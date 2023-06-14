//21.find out avg of 2nd half of the elements in the given int array?

class A21
{
	public static void main(String[] args) 
	{
		int[] array={1,5,2,6,9,1,0,3,4,5};
		//                0 1 2 3 4 5 6 7 8 9 
		
	int sum=0;
		  for(int i=array.length/2;i<array.length;i++)
		  {
			 
		sum+=array[i];
		  }
		  double avg =(double)sum/(array.length/2);
		 	System.out.println("avg:"+avg);//array containg index number.. index number always starting from 0	

	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A21
avg:2.6
*/