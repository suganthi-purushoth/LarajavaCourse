class A 
{
	static
	{
		System.out.println("A-SIB");
	}
}
class B extends A
{
	static
	{
		System.out.println("B-SIB");
	}
}
class C extends B
{
	static
		{
			System.out.println("C-SIB");
	     }
}
class Z4
{
	static
	{
		System.out.println("Z3-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		B b1=new B();
		System.out.println("--------------");
		C c1=new C();
		System.out.println("--------------");
		A a1=new A();
		System.out.println("--------------");
		Z4 z1=new Z4();
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

D:\java-program-lab\inheritance\src>java -cp ../classes Z4
Z3-SIB
main begin
A-SIB
B-SIB
--------------
C-SIB
--------------
--------------
--------------
main end

*/