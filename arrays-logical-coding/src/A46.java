//46.find out all the three elements whos sum is zero

class  A46
{
	public static void main(String[] args) 
	{
		int[]array={-1,5,-4,9,8,-3,-5,-8,6,4};
         //         0 1 2 3 4 5 6 7 8 9
		 for (int i=0;i<array.length-1 ;i++ )
		 {
			 for(int j=i+1;j<array.length-1;j++)
			 {
				 for(int k=j+1;k<array.length-1;k++)
				 {
					
			 if(array[i]+array[j]+array[k]==0)
			 {
				 System.out.println(array[i]+"+ "+array[j]+"+"+array[k]+"=0");
			 }
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
