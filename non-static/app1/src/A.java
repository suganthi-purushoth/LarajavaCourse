class A 
{
	int i;//non static variable.attribute field or property
	public static void main(String[] args) 
	{
		System.out.println(i);//non static inside the main ()
	}
}
//non static members cannot be reference from a static context without a referance variable
/*

D:\java-program-lab\non-static\app1\src>javac -d ../classes A.java
A.java:6: error: non-static variable i cannot be referenced from a static context
                System.out.println(i);
                                   ^
1 error

*/