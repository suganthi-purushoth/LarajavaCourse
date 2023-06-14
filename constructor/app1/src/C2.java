class C2
{

	int i=100;
	C()
	{
		System.out.println("C()");
		i=10;
	}
	
	public static void main(String[] args) 
	{
		C c1=new C();
		System.out.println("--------------");
		System.out.println(c1.i);
	}
}
/*

D:\java-program-lab\constructor\app1\src>java -cp ../classes C
C()
--------------
10
*/