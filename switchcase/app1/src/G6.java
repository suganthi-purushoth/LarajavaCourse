class G6
{
	public static void main(String[] args) 
	{
		if(true)
		{
			int i=10;
			switch(i)
			{
			default:
				System.out.println("from default");
				break;
			case 2:
				System.out.println("from case 2");
				break;
			case 3:
				System.out.println("from case 3");
				break;
			case 5:
				System.out.println("from case 5");
				break;
		}
		}
				System.out.println("main end");

				
	}
}
/*

D:\java-program-lab\switchcase\app1\src>java -cp ../classes G6
from default
main end

*/