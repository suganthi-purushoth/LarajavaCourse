class S 
{
	public static void main(String[] args) 
	{
			
		System.out.println("main begin");
		double[] elements={1.2,4.5,7.0};
		double element;
		for(element  :elements)
			{
			System.out.println(element);
			}
			System.out.println("main end");

	}
}

D:\java-program-lab\if-else\app6\src>javac -d ../classes S.java
S.java:9: error: bad initializer for for-loop
                for(element  :elements)
                    ^
1 error