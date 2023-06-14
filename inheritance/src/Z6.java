class A 
{
	static
	{
		System.out.println("A-SIB");
	}
	A()
	{
		//super()
		//IIB
		System.out.println("A()");
	}
	{
		System.out.println("A-IIB");
	}

}
class B extends A
{
	static
	{
		System.out.println("B-SIB");
	}
	B()
	{
		//super()
		//IIB
		System.out.println("B()");
	}
	{
		System.out.println("B-IIB");
	}

}
class C extends B
{
	static
		{
			System.out.println("C-SIB");
	     }
	 C()
	{
		 //super()
		//IIB
		System.out.println("C()");
	}
	{
		System.out.println("C-IIB");
	}

}
class Z6
{
	static
	{
		System.out.println("Z6-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		C c1=new C();
		System.out.println("--------------");
		
		B b1=new B();
		System.out.println("--------------");
		A a1=new A();
		System.out.println("--------------");
		
		System.out.println("main end");
		
	}
}
//Z3 not having dependency
//any class will be loaded only once for one time execution. 
			//if that class is already available in the memory while in the execution then again that class will not be loading to the memory.
//Z3 .java compile all class are be loaded that time
//while compiling the class Z3 that time all class SIB loading only once, when we create the obj for that class 
              //then the SIB will be loading only once, 
			  //after sub class calling only super class but that super class SIB will not be execute becase its already loaded.

/*

D:\java-program-lab\inheritance\src>java -cp ../classes Z6
Z6-SIB
main begin
A-SIB
B-SIB
C-SIB
A-IIB
A()
B-IIB
B()
C-IIB
C()
--------------
A-IIB
A()
B-IIB
B()
--------------
A-IIB
A()
--------------
main end

*/