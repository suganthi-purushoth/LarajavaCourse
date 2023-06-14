class M 
{
	static int i=20;
	static
	{
		i=100;//reinitialization
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
/*

D:\java-program-lab\static\app3\src>java -cp ../classes M
100
*/