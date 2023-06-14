class R1 
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		double[] elements={1.2,4.5,7.0};
		for(double doubleElements  :elements)
			{
			System.out.println((int)doubleElements);
			}
			System.out.println("main end");
	}
}

D:\java-program-lab\if-else\app6\src>java -cp ../classes R1
main begin
1
4
7
main end
