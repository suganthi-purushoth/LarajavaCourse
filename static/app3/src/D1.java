class D1
{
	static int i;
	static int j=D.i;//direct read

	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}

/*

D:\java-program-lab\static\app3\src>java -cp ../classes D1
0
0
*/