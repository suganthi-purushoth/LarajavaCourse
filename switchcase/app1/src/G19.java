class  G19
{
	public static void main(String[] args) 
	{
		int i=10;
		{
			{
				
		    System.out.println("Inner NormalBlock:"+i);
			}
			System.out.println("OuterNormalBlock:"+i);
		}
		System.out.println("main end:"+i);
	}
}
/*

D:\java-program-lab\switchcase\app1\src>java -cp ../classes G18
Inner NormalBlock:10
OuterNormalBlock:10
main end:10

*/