class T 
{
	static int i;
	public static void main(String[] args) 
	{
		
		System.out.println("main:"+i);
	}
	public static void test()
	{
		System.out.println("test:"+i);
	}
}

/*

D:\java-program-lab\static\app1\src>java -cp ../classes T
main:0
*/