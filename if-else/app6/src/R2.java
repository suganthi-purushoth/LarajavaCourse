class  R2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		double[] elements={1.2,4.5,7.0};
		for(int i=0;i<elements.length;i++)
			{
			System.out.println((int)elements[i]);
			}

			System.out.println();
			for(double doubleElements:elements)
		{
				System.out.println((int)doubleElements);
			}
			System.out.println("main end");
	}
}



D:\java-program-lab\if-else\app6\src>java -cp ../classes R2
main begin
1
4
7

1
4
7
main end
