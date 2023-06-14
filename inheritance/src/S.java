//constructor chaining (one constructor calling another constructor)
class A
{
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		this();//current class
		System.out.println("A(int)");
	}
}
class B extends A
{
	B()//automatically super calling stmt calling A(),super cls calling no argument constructor
	{
		super(10);
		System.out.println("B()");
	}
	B(int i)
	{
		this();
		System.out.println("B(int)");
	}
}
class C extends B
{
	C()
	{
		this(90);//current class
		System.out.println("C()");
	}
	C(int i)
	{
		super(i);//super class
		System.out.println("C(int)");
	}
}
class S extends C
{
	S()
	{
		this(90);
		System.out.println("S()");
	}
	S(int i)
	{
		super(200);
		System.out.println("S(int)");
	}

	public static void main(String[] args) 
	{
		A a1=new A();
		System.out.println("------------");
		B b1=new B();
		System.out.println("------------");
		C c1=new C();
		System.out.println("------------");
		S s1=new S();
		System.out.println("------------");
		A a2=new A(10);
		System.out.println("------------");
		B b2=new B(10);
		System.out.println("------------");
		C c2=new C(10);
		System.out.println("------------");
	    S s2=new S(10);
		System.out.println("------------");
	}

}
//constructor chaining (one constructor calling another constructor)
/*


D:\java-program-lab\inheritance\src>java -cp ../classes S
A()
------------
A()
A(int)
B()
------------
A()
A(int)
B()
B(int)
C(int)
C()
------------
A()
A(int)
B()
B(int)
C(int)
S(int)
S()
------------
A()
A(int)
------------
A()
A(int)
B()
B(int)
------------
A()
A(int)
B()
B(int)
C(int)
------------
A()
A(int)
B()
B(int)
C(int)
S(int)
------------

*/


