class P
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	public static void test()
	{
		System.out.println("test begin");
		if(true)
		{
			System.out.println("if block");
			return ;
		}
		System.out.println("testend");
	}
}

/*

D:\java-program-lab\method\app1\src>java -cp ../classes P
main begin
test begin
if block
main end
*/