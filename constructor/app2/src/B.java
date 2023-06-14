class B
{
	B()
	{
		System.out.println("B()");
	}
	//before calling of constructor IIB will be executing

	{//this block is the IIB block,outside of the anywhere
		System.out.println("IIB");
	}
	public static void main(String[] args) 
	{
		B b1=new B();
		System.out.println("-----------");
		B b2=new B();
		System.out.println("-----------");
	}
}
/*
IIB -Instance Initialization Block
------------------------------------
IIB blocks can be developed outside of any method and inside the class.
before the execution of constructor IIB blocks will be executing from top to bottom only once for one object creation.
IIB blocks are non static 
we can create any number of IIB block.
if you are creating IIB blocks inside of any other blocks then that will be not considered as IIB block,it will be just a normal block.

need of IIB block:
--------------------
if there is any common implementation is there for all the objects then we can keep that in IIB block.


D:\java-program-lab\constructor\app2\src>java -cp ../classes B
IIB
B()
-----------
IIB
B()
-----------

*/
