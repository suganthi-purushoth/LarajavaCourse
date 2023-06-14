class A 
{
	A()
	{
		System.out.println("from A()");
	}
	public static void main(String[] args) 
	{
		A a1=new A();//A() A cls constructor,
		System.out.println("done");
	}
}
//what is a constructor?
//constructor is a special type of method,but its not a regular method,
//internaly compiler will be consider it a method.
//the main difference between a method and constructor is that method must have return type,but construtor must not have a return type.
//constructor are mainly used for initializing objects
//if there are no constructors are defined by the programmer then,compilar only keeps a default constructor,in every class, which is no argument constructor.(its doesnot takes any argument).

/*
Rules for constructor:
-----------------------
1.Constructor name must be same as class name(case-sensitive).
2.constructors must not have return type.
3.constructors must be having a body { }.

Some general points related to constructor:
-----------------------------------------
1.constructors can have access specifiers or access modifiers.
2.constructors can take any number of arguments,any type of statement.
3.constructors are executed while we are creating the object to that particular class.
4.while creating the object we need to call the a corresponding, available constructor only.


D:\java-program-lab\non-static\app2\src>java -cp ../classes A
from A()
done

*/