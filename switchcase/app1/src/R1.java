class R1
{
	public static void main(String[] args) 
	{
		String i="1";
		switch(i)
		{
			
			case "1"://case name data type should be case argument type
				System.out.println("from case xyz");
				for(int j=1;j<=2;j++)
			{
					System.out.println("from case 1 loop:"+i);
			}
			break;

			case "2":
				System.out.println("from case 1");
				
			break;
			
	}
	
}
}
/*

D:\java-program-lab\switchcase\app1\src>java -cp ../classes R1
from case xyz
from case 1 loop:1
from case 1 loop:1	
*/