//36.find out the continues elements which are in the ascending/descending order?
class A36
{
	public static void main(String[] args) 
	{
		int[] array={1,5,6,9,7,5,3,4,5,8,24,15,11,10,7};
		//                0 1 2 3 4 5 6 7 8 9 
		boolean asc=true,desc=true;
		System.out.print(array[0]+",");
		  for(int i=1;i<array.length;i++)
		  {
			 if(asc && array[i-1]<array[i])
			  {	
				 System.out.print(array[i]+",");
				 asc=true;
				 desc=false;
				 }
				 else if(!desc)
			  {
					 System.out.println();
					 System.out.print(array[i]+",");
					 desc=true;
					 continue;
			  }

			  if(desc && array[i-1]>array[i])
			  {
				  System.out.print(array[i]+",");
				  asc=false;
				  desc=true;
			  }
			  else if(!asc)
			  {
				  System.out.println();
				  System.out.print(array[i]+",");
				  asc=true;
			  }
		  }
		  }
	}

/*


D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A36
1,5,6,9,
7,5,3,
4,5,8,
*/
