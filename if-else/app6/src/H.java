class H 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i=1;i<=10;i++)
		{
			System.out.println("loop begin:"+i);
			if(i==4)
			{
				System.out.println("if begin");
				break;continue;
			}
			System.out.println("loop end:"+i);
		  }
			System.out.println("main end");
	}
}

D:\java-program-lab\if-else\app6\src>javac -d ../classes H.java
H.java:12: error: unreachable statement
                                break;continue;
                                      ^
1 error
