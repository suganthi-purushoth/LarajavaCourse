class A50
{
	public static void main(String[] args) 
	{
		int [] array  = {5, 6, 9, 7,3, 8, 4,2,1};
		for (int i = 0; i < array.length; i++)
		{
			if (i<=array.length/2)
			{
              array[i]+=5;
			}
			  else
			{
			array[i]-=10;
			}
			System.out.println(array[i]);
		}
	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A50
10
11
14
12
8
-2
-6
-8
-9
*/