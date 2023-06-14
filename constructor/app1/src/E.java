class E 
{
	int i;
	E(int k)
	{
		System.out.println("K(int)");
		i=10;//initializing in obj content
	}
	public static void main(String[] args) 
	{
		E e1=new E(9);//supply the int value
		System.out.println("------------");
		E e2=new E(90);
		System.out.println("------------");
		E e3=new E(910);
		System.out.println("------------");
		System.out.println(e1.i);
		System.out.println(e2.i);
		System.out.println(e3.i);
	}
}
//for one object creation that particular constructor executes only one(constructor changing is different)
//according to the constructor argument datatype,we must supply the value while calling that constructor.

/*
D:\java-program-lab\constructor\app1\src>java -cp ../classes E
K(int)
------------
K(int)
------------
K(int)
------------
10
10
10
*/