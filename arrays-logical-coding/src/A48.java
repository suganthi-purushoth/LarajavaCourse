class A48
//48.increment every value to 5 units

{
	public static void main(String[] args) 
	{
		int [] array  = {5, 6, 9, 7,3, 8, 4,2,1};
		for (int i = 0; i < array.length; i++)
		{
			array[i]+=5;
			System.out.println(array[i]);
		}
	}
}
/*

D:\java-program-lab\arrays-logical-coding\src>java -cp ../classes A48
10
11
14
12
8
13
9
7
6*/