class  Z1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		for(int i=1;i<=5;i++)
				System.out.println("loop body"+i)
				System.out.println("loop body:"+i);
		System.out.println("main end");
	}
}




//D:\java-program-lab\if-else\app5\src>javac -d ../classes Z1.java
//Z1.java:8: error: ';' expected
  //                              System.out.println("loop body"+i)
                                                                 ^
//1 error