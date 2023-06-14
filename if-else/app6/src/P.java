class P 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int[] elements ={10,30,20,70,35,28};
		for(int element : elements)   //for-each (JDK1.5)
		{
			System.out.println(element);
		}

			System.out.println("main end");
	}
}


D:\java-program-lab\if-else\app6\src>java -cp ../classes P
main begin
10
30
20
70
35
28
main end
