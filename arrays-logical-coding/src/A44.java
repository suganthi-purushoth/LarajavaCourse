//44.print all two consecutive odd elements

class  A44
{
	public static void main(String[] args) 
	{
		int[]array={0,5,7,8,9,2,3,5,6,4};
         //         0 1 2 3 4 5 6 7 8 9
		 for (int i=0;i<array.length-2 ;i++ )
		 {
			 if(array[i+1]+array[i]== array[i+2])
			 {
				 System.out.println(array[i]+"+ "+array[i+1]+"="+array[i+2]);
			 }
		 }
	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A44
2+ 3=5
*/