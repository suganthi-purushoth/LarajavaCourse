//43.print all two consecutive odd elements

class  A43
{
	public static void main(String[] args) 
	{
		int[]array={2,7,8,4,6,7,9,5,7,3,1,6,96,5};
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i+1]%2!=0&&array[i]%2!=0)
			{
				System.out.println(array[i]+" "+array[i+1]+" ");
			}
		}
	}
}
/*
D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A43
7 9
9 5
5 7
7 3
3 1
*/