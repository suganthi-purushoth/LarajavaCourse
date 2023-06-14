package pack1;
class D
{
	private void test()//method also we can use access specifier
	{
		System.out.println("from test()");
	}
}
class E
{
	public static void main(String[] args) 
	{
		D d1=new D();
		d1.test();
		System.out.println("Done");
	}
}
//in one java file any num of classes can be developed.
//for all the classes a .class will be generated(after the successful compilation of .java file) Ex. A.class, B.class, C.class

/*
D:\java-program-lab\access-levels\app1\src>javac -d ../classes pack1/E.java
pack1\E.java:14: error: test() has private access in D
                d1.test();
                  ^
1 error*/