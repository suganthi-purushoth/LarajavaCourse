class D 
{
	int i;
	int j=20;//two static members i,j
	D()
	{
		System.out.println("D()");
		i=10;
	}
	public static void main(String[] args) 
	{
		D d1=new D();
		System.out.println("------------");
		System.out.println(d1.i);
		System.out.println(d1.j);
	}
}
//non static members can be used straight away int he non static context without a reference variable.

/*

D:\java-program-lab\constructor\app1\src>java -cp ../classes D
D()
------------
10
20

*/