class P 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=10;
		for(;i<=5;i++)
		{
			System.out.println("loop body:"+i);
		}
		System.out.println("main end:"+i);
	}
}


//D:\java-program-lab\if-else\app5\src>javac -d ../classes P.java

//D:\java-program-lab\if-else\app5\src>java -cp ../classes P
//main begin
//main end:10