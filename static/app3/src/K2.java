class K2
{
	static//static block
	{
		System.out.println(i=10);
	}	

	static void test()//static method
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


D:\java-program-lab\static\app3\src>java -cp ../classes K2
10
10
done
*/