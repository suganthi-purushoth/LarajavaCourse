class  R
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		double[] elements={1.2,4.5,7.0};
		for(int element  :elements)
			{
			System.out.println(element);
			}
			System.out.println("main end");
}
}


D:\java-program-lab\if-else\app6\src>javac -d ../classes R.java
R.java:8: error: incompatible types: possible lossy conversion from double to int
                for(int element  :elements)
                                  ^
1 error