class G 
{
	public static void main(String[] args) 
	{
		int i=10;
		System.out.println("main begin:"+i);
		test();
		System.out.println("main end:"+i);
	}
	public static void test()
	{
		int i=20;
		System.out.println("from test:"+i);

	}
}

/*
D:\java-program-lab\method\app1\src>java -cp ../classes G
main begin:10
from test:20
main end:10
*/