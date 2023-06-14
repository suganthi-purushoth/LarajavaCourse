class V 
{
	public static void main(String[] args) 
	{
		System.out.println("main from V");
	}
	static 
	{
		System.out.println("SIB from V");
	}
}
/*

D:\java-program-lab\static\app3\src>java -cp ../classes V
SIB from V
main from V
*/