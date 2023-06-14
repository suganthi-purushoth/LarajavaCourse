//22.find out min value from a given int array?
class A22
{
	public static void main(String[] args) 
	{
		int[] array={1,5,2,6,9,1,0,3,4,5};
		//                0 1 2 3 4 5 6 7 8 9 
		
	int min =Integer.MAX_VALUE;
		  for(int i=0;i<array.length;i++)
		  {
			 if(array[i]<min)
			  {
				 min=array[i];
			  }
		  }
		 	System.out.println("min:"+min);//array containg index number.. index number always starting from 0	

	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A22
min:0

*/