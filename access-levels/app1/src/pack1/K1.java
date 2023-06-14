package pack1;
class J
{
	//private class
	//within the class itself thats all.
	//x is private
	//private member not inheriting to the sub class
	 private int x;
	//y is default/package level/friendlys
	//default member can be inherited to the subclass within the same package
	//default access
	//same class ==>ok
	//sub-class  -same package =>ok
	//non subclass same pacakge==>ok
	//outside the package ==>No
	int y;
}
class K1 
{
	public static void main(String[] args) 
	{
		J j1=new J();
		System.out.println(j1.x);
		System.out.println(j1.y);
	}
}
/*
//in this o/p int x is not privates
D:\java-program-lab\access-levels\app1\src>java -cp ../classes pack1.K1
0
0
*/