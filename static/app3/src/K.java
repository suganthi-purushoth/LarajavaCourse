class K
{
	static void test()
	{
		System.out.println(i);
	}
	static
	{
		test();
	}
	static int i;
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*
D:\java-program-lab\static\app3\src>java -cp ../classes K
0
done
*/