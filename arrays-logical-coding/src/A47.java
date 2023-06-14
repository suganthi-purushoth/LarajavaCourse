//47.find out the nearest number for every number

class  A47
{
	public static void main(String[] args) 
	{
		int[]array={-1,5,-4,9,8,-3,-5,-8,6,4};
         //         0 1 2 3 4 5 6 7 8 9
		 for (int i=0;i<array.length-1 ;i++ )
		 {
			 for(int j=i+1;j<array.length-1;j++)
			 {
					
			 if(array[i]<array[j]==||array[i]>array[j]==)
			 {
				 System.out.print(array[i]+" ");
				 System.out.print(array[j]+" ");
				 System.out.println();
			 }
		 }
	
	}
}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A46
-1+ 5+-4=0
-1+ 9+-8=0
-1+ -5+6=0
-4+ 9+-5=0
8+ -3+-5=0
*/
