class L 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			int i=100;
			System.out.println("if block -stmt1");
			System.out.println("if block -stmt2");
			System.out.println("if block -stmt3:"+i);
		}
		System.out.println("main end:"+i);
	
	}
}
D:\java-program-lab\app8\src>javac -d ../classes L.java
L.java:13: error: cannot find symbol
                System.out.println("main end:"+i);
                                               ^
  symbol:   variable i
  location: class L
1 error