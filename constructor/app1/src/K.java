class K 
{
	K(int i)
	{
		System.out.println("K(int)");
	}
	K(boolean b)
	{
		System.out.println("K(boolean)");
	}
	
	public static void main(String[] args) 
	{
		K k1=new K(90);
		System.out.println("-------------");
		K k2=new K (true);
		System.out.println("-------------");
		}
}
/*
D:\java-program-lab\constructor\app1\src>java -cp ../classes K
K(int)
-------------
K(boolean)
-------------
*/
