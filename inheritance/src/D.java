//single inheritance
class C 
{
	void test1()
	{
		System.out.println("from test1");
	}
}
class D extends C
{
	void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String[] args) 
	{
		D d1=new D();
		d1.test1();
		d1.test2();

	}
}
//method also using inheritance
//we can create class reference to  another class,but only parent cls methods only loading

/*
D:\java-program-lab\inheritance\src>java -cp ../classes D
from test1
from test2
*/