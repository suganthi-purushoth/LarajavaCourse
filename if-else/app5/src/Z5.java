class Z5 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		for(int i=0;i<=5;i++);
				System.out.println("loop body1 stmt1:"+i);
				
		System.out.println("main end");
	}
}
// i it cannot execute out side the for loop. here (for(int i=0;i<=5;i++);)


//D:\java-program-lab\if-else\app5\src>javac -d ../classes Z5.java
//Z5.java:8: error: cannot find symbol
//                                System.out.println("loop body1:"+i);
                                                                 ^
 // symbol:   variable i
 // location: class Z5
//1 error

