//45.find out all the two elements whos sum is zero

class  A45
{
	public static void main(String[] args) 
	{
		int[]array={0,5,7,8,9,2,-5,-8,6,4};
         //         0 1 2 3 4 5 6 7 8 9
		 for (int i=0;i<array.length-1 ;i++ )
		 {
			 for(int j=i+1;j<array.length-1;j++)
			 {
			 if(array[i]+array[j]==0)
			 {
				 System.out.println(array[i]+"+ "+array[j]+"=0");
			 }
		 }
	}
	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A45
5+ -5=0
8+ -8=0
*/