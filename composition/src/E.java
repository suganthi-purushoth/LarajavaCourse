class A 
{
	int i;
	void test1()
	{
		System.out.println("A-test1");
	}
}
class E
{  
	//non-static
	static A obj=new A();
	//non-static
	void test2()
	{
		System.out.println("E-test2");
		System.out.println(obj.i);
		obj.test1();
	}
	public static void main(String[] args) 
	{
		E e1=new E();
		e1.test2();
	}
}
/*
D:\java-program-lab\composition\src>java -cp ../classes E
E-test2
0
A-test1
*/