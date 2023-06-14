class D 
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		for(int i=1;i<=10;i++)
		{
			System.out.println("loop begin:"+i);
			if(i<=4)
			{
				continue;
				System.out.println("if end");
				{
				}
			}
			System.out.println("loop end:"+i);
		}
			System.out.println("main end");
	}
}

// continue or return for if block.. 

//D:\java-program-lab\if-else\app6\src>javac -d ../classes D.java
//D.java:13: error: unreachable statement
 //                               System.out.println("if end");
                                ^
//1 error


