class A 
{
	static int p;
	A()
	{
		p+=10;
	}
	{
		p+=20;
	}
	void test1()
	{
		p+=30;
	}
	static void test2()
	{
		p+=40;
	}
	public static void main(String[] args) 
	{
		System.out.println("a:"+p);
		A a1=new A();
		System.out.println("b:"+p);
		a1.test1();
		System.out.println("c:"+p);
		test2();
		System.out.println("d:"+p);

	}
}
/*
//static members can be used stright away in the static and non-static
//static var loading only once
D:\java-program-lab\obj-count\app1\src>java -cp ../classes A
a:0
b:30
c:60
d:100
*/
