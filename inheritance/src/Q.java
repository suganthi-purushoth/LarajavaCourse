//constructor chaining (one constructor calling another constructor)
class A
{
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{

		System.out.println("A(int)");
	}
}
class B extends A
{
	B()//automatically super calling stmt calling A(),super cls calling no argument constructor

	{
		System.out.println("B()");
	}
	B(int i)
	{
		super();
		System.out.println("B(int)");
	}
}
class C extends B
{
	C()
	{
		System.out.println("C()");
	}
	C(int i)
	{
		super();
		System.out.println("C(int)");
	}
}
class Q extends C
{
	Q()
	{
		System.out.println("Q()");
	}
	Q(int i)
	{
				super();
		System.out.println("Q(int)");
	}

	public static void main(String[] args) 
	{
		A a1=new A();
		System.out.println("------------");
		B b1=new B();
		System.out.println("------------");
		C c1=new C();
		System.out.println("------------");
		Q q1=new Q();
		System.out.println("------------");
		A a2=new A(10);
		System.out.println("------------");
		B b2=new B(10);
		System.out.println("------------");
		C c2=new C(10);
		System.out.println("------------");
		Q q2=new Q(10);
		System.out.println("------------");
	}
}
//constructor chaining (one constructor calling another constructor)
/*

D:\java-program-lab\inheritance\src>java -cp ../classes Q
A()
------------
A()
B()
------------
A()
B()
C()
------------
A()
B()
C()
Q()
------------
A(int)
------------
A()
B(int)
------------
A()
B()
C(int)
------------
A()
B()
C()
Q(int)
------------*/