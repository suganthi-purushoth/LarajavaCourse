class Z7 
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		int i;
		for( i=0;i<=5;i++);
		{
				System.out.println("loop body1:"+i);
		}		
		System.out.println("main end");
	}
	
}

D:\java-program-lab\if-else\app5\src>javac -d ../classes Z7.java

D:\java-program-lab\if-else\app5\src>java -cp ../classes Z7
main begin
loop body1:6
main end
