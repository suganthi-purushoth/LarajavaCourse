class V
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	
		do
		{
				int i=1; // int i declear before the do while not inside
			System.out.println("body begin:"+i);
			System.out.println("body end:"+i);
			i++;
		}
		while(i<=5);
		

		System.out.println("main end");
	}

	
}



/*

D:\java-program-lab\if-else\app7\src>javac -d ../classes V.java
V.java:14: error: cannot find symbol
                while(i<=5);
                      ^
  symbol:   variable i
  location: class V
1 error
*/