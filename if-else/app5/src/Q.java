class Q 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=4;
		for(;i<=5;i++)
		{
			System.out.println("loop body:"+i);
		}
		System.out.println("main end:"+i);
	}
}


//D:\java-program-lab\if-else\app5\src>javac -d ../classes Q.java

//D:\java-program-lab\if-else\app5\src>java -cp ../classes Q
//main begin
//loop body:4
//loop body:5
//main end:6