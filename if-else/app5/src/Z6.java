class  Z6
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		for(int i=0;i<=5;i++);
		{
				System.out.println("loop body1:"+i);
		}		
		System.out.println("main end");
	}
}


// i it not vissible in outside loop

//D:\java-program-lab\if-else\app5\src>javac -d ../classes Z6.java
//Z6.java:9: error: cannot find symbol
   //                             System.out.println("loop body1:"+i);
                                                                 ^
 // symbol:   variable i
  //location: class Z6
//1 error