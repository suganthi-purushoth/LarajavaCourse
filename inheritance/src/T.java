class A 
{
	//here no having a no argument constructor,making a sub class constructor only no arg constructor 
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class T extends A
{
	T(int i)
	{
		System.out.println("T(int)");
	}
	public static void main(String[] args) 
	{
		T t1=new T(90);
		System.out.println("Done");
	}
}
/*D:\java-program-lab\inheritance\src>javac -d ../classes T.java
T.java:11: error: constructor A in class A cannot be applied to given types;
        {
        ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error
*/
