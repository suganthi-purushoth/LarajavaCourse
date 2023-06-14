package pack1;
class A
{
	private int i;//access specifier
	public static void main(String[] args) 
	{
		A a1=new A();
		System.out.println(a1.i);
	}
}
//access specifiers == access modifiers
//we can control over the data,which one should be shared and which one should not be over package structure
//the access specifiers in java maintains the accessibility or scope of a field, method,constructor,or class.
//private || default || protected || public
//default ==  package level access specifier ==  friendly access specifier
//private members can be access within the class only
//the scope of private member is within the declared class.
//private members cannot be accessed outside of the class.

/*
D:\java-program-lab\access-levels\app1\src>javac -d ../classes pack1/A.java

D:\java-program-lab\access-levels\app1\src>java -cp ../classes pack1.A
0

*/