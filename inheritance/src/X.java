class A 
{
	A()
	{
		//super()
		//IIB
		System.out.println("A()");
	}
	A(int i)
	{
		//super(),1st super cls will execute 
		//IIB,after IIB execute
		//then A(int)
	System.out.println("A(int)");
	}
	{
	System.out.println("A-IIB");
	}
}
class B extends A 
{
	B()
	{
		//super()
		//IIB
		System.out.println("B()");
	}
	B(int i)
	{
		this();
	System.out.println("B(int)");
	}
	{
	System.out.println("B-IIB1");
	}

	{
	System.out.println("B-IIB2");
	}
}
class X
{
	public static void main(String[] args) 
	{
		A a1=new A();
		System.out.println("-----------");
		A a2=new A();
		System.out.println("-----------");
		B b1=new B();
		System.out.println("-----------");
		B b2=new B();
		System.out.println("-----------");
		A a3=new A(20);
		System.out.println("-----------");
		A a4=new A(30);
		System.out.println("-----------");
		B b3=new B(30);
		System.out.println("-----------");
		B b4=new B(40);
		System.out.println("-----------");
	}
}
//after IIB,constructor will execute
//for one object creation IIB block executes top to bottom only once before the constructors
/*

D:\java-program-lab\inheritance\src>java -cp ../classes X
A-IIB
A()
-----------
A-IIB
A()
-----------
A-IIB
A()
B-IIB1
B-IIB2
B()
-----------
A-IIB
A()
B-IIB1
B-IIB2
B()
-----------
A-IIB
A(int)
-----------
A-IIB
A(int)
-----------
A-IIB
A()
B-IIB1
B-IIB2
B()
B(int)
-----------
A-IIB
A()
B-IIB1
B-IIB2
B()
B(int)
----------- */