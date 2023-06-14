class K
{
	public static void main(String[] args) 
	{
		System.out.println("main:");
	}
	static
	{
		System.out.println("SIB");
		main(null);
	}
	
}
/*

D:\java-program-lab\static\app2\src>java -cp ../classes J
SIB
main:
main:
*/