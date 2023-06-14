 class A 
{
	static int i;
	static
	{
		System.out.println(" SIB1 from A");
	}
	static
	{
		System.out.println("SIB2 from A");
	}
}
class P7
{
	static
		{
			System.out.println("SIB1 from P6");
		}
		

	public static void main(String[] args) 
	{
		
		System.out.println("main :");
	}
}
/*

D:\java-program-lab\static\app3\src>java -cp ../classes P7
SIB1 from P6
main :
*/

//in java file max 0,1 only one public class is available
//the class name must be a public

