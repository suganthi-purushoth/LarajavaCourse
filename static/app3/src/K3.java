class K3
{
	static int j=test();

	static//static block
	{
		System.out.println(i=10);
	}	

	static int test()//static method
	{
		System.out.println(i);
		return i;
	}
	static
	{
		test();
	}
	static int i;
	public static void main(String[] args) 
	{
		System.out.println("done"+i);
		System.out.println("done"+j);
	}
}

/*

D:\java-program-lab\static\app3\src>java -cp ../classes K3
0
10
10
done10
done0


*/