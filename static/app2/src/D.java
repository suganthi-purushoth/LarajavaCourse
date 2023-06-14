class D 
{
	static int i=10;
	static int j=20;
	static
	{
		//some code
	}

	public static void main(String[] args) 
	{
		System.out.println(i+","+j);
	}
}
/*

D:\java-program-lab\static\app2\src>java -cp ../classes D
10,20
*/