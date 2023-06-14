class T
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=10;
		do
		{
			System.out.println("body begin:"+i);
			System.out.println("body end:"+i);
			i++;
		}
		while(i<=5);
		

		System.out.println("main end");
	}

	
}



/*
D:\java-program-lab\if-else\app7\src>java -cp ../classes T
main begin
body begin:10
body end:10
main end
*/