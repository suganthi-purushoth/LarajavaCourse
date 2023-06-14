class M2
{
	static
	{
		System.out.println(M.i);
	}
	 static int i=200;//non-static
	static
	{
		System.out.println(i);
		i=100;
		System.out.println(i);
	}

	public static void main(String[] args) 
	{
	}
		
}
/*

D:\java-program-lab\non-static\app1\src>java -cp ../classes M2
0
200
100
*/