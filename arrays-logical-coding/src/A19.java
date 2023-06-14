//19.find out avg of first half of the elements in the given int array?
class A19
{
	public static void main(String[] args) 
	{
		int[] array={1,5,2,6,9,1,0,3,4,5};
		//                0 1 2 3 4 5 6 7 8 9 
		
	int sum=0;
		  for(int i=0;i<array.length/2;i++)
		  {
			 
		sum+=array[i];
		  }
		  double avg =(double)sum/(array.length);
		 	System.out.println("avg:"+avg);//array containg index number.. index number always starting from 0	

	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A19
avg:4.6


*/