//49.decrement every value to 10 units
class A49
	{
	public static void main(String[] args) 
	{
		int [] array  = {5, 6, 9, 7,3, 8, 4,2,1};
		for (int i = 0; i < array.length; i++)
		{
			array[i]-=10;
			System.out.println(array[i]);
		}
	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A49
-5
-4
-1
-3
-7
-2
-6
-8
-9
*/