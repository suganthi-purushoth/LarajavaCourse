class Object
{
	Object()
	{
	}
}
class N2 extends Object
{
	N()
	{
		super();
		System.out.println("N()");
		
	}
	N(int i)
	{
		this();//using default block constructor
		System.out.println("N(int)");
	}

	public static void main(String[] args) 
	{
		N n1=new N();
		System.out.println("-----------");
		N n2=new N(10);
		System.out.println("-----------");
	}
}
//super()=(super with no arg)
//in every constructor body the first statement would be super()(super with no arg) calling statement.
     //(if the programmer didnot keep super or this calling statement explicitely)
//each and every class is a subclass to object class(wheather directly or indirectly)
//object class is the supermost class in java
//some of the commonely required members are inherited to the sub- classes from the object class.
//super calling statement is calling the object calss no argument constructor
//in the object class we have one constructor which is no argument constructor,and we dont have any statements inside that constructor
//super statement will be always calling the super class constructor.
//super and this statements comes under non-static.
//this calling statement always calls the current class constructor not the super class constructor.
//if we only kept super(),or any super withargument then compiler will not be keeping super() 




/*

D:\java-program-lab\constructor\app1\src>javac -d ../classes N2.java
N2.java:9: error: invalid method declaration; return type required
        N()
        ^
N2.java:15: error: invalid method declaration; return type required
        N(int i)
        ^
2 errors

*/