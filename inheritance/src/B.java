//This is example for single inheritance
//Java supports single inherritance,meaning a class can inherits from only one superclass.
class A //parent cls or base cls or super cls
{
	int i;//non static 
}
// cls B==child cls or derived cls or sub cls
//one cls can able to extend another cls at a time.
//at a time a class can able to extend only one class.

class B extends A
{
	int j;//members
	public static void main(String[] args) 
	{
		B b1=new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
/*
Inheritance:
-------------
i.Inheritance is process of aquiring the properties(data members) and behaviours(data var or member function) from another class.
ii.By using inheritance we can achieve code reuseability.
iii.Inheritance is a fundamental concept in object oriented programming that allows classes to inherit properties and behaviors from other classes.
iv.

The code you provided demonstrates Java inheritance. Class 'B' extends class 'A', which means that 'B' inherits the members of 'A',
		including the 'i' variable. In the 'main' method of class 'B',an object of type 'B' is created and assigned to the variable
		


D:\java-program-lab\inheritance\src>java -cp ../classes B
------------------------------------------------------------------
0
0		*/
