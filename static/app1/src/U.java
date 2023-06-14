class U 
{
	static int i;
	public static void main(String[] args) 
	{
		
		System.out.println("main:"+i);
		test();
		
		U.test();
	}
	public static void test()
	{
		System.out.println("test:"+i);
	}
}

/*

D:\java-program-lab\static\app1\src>java -cp ../classes U
main:0
test:0
test:0
*/