package pack1;
class J
{
	//x is private
	//private member not inheriting to the sub class
	private int x;
	//y is default/package level/friendlys
	//default member can be inherited to the subclass within the same package
	int y;
}
class K extends J
{
	public static void main(String[] args) 
	{
		K k1=new K();
		System.out.println(k1.x);
		System.out.println(k1.y);
	}
}
/*
D:\java-program-lab\access-levels\app1\src>javac -d ../classes pack1/K.java
pack1\K.java:12: error: x has private access in J
                System.out.println(k1.x);
                                     ^
1 error
*/