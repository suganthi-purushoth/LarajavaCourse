class F
{
	public static void main(String[] args) 
	{
		int i=10;
		switch(i)
		{
			case 2:
				System.out.println("from case 2");
				
			break;
			default:
				System.out.println("from default");

			case 3:
				System.out.println("from case 3");
				
			break;
			case 5:
				System.out.println("from case 5");
				
			break;
	}
	System.out.println("main end");
}
}
/*

D:\java-program-lab\switchcase\app1\src>java -cp ../classes F
from default
from case 3
main end

*/