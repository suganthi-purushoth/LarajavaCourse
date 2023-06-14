class A 
{
	int i;
	void test1()
	{
		System.out.println("A-test1");
	}
}
class C  //there is no extends 
{
	A obj;//just creating the ref of A class
	void test2()
	{
		System.out.println("C-test2");
		//System.out.println(i);
		//test1();
	}
	public static void main(String[] args) 
	{
		C c1=new C();
		
		c1.test1();
	}
}
/*
D:\java-program-lab\composition\src>javac -d ../classes C.java
C.java:15: error: cannot find symbol
                System.out.println(i);
                                   ^
  symbol:   variable i
  location: class C
C.java:16: error: cannot find symbol
                test1();
                ^
  symbol:   method test1()
  location: class C
2 errors*/