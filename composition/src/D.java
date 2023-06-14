class A 
{
	int i;
	void test1()
	{
		System.out.println("A-test1");
	}
}
class D//class D having a ref of class A,here not extends
{
	A obj;
	void test2()
	{
		System.out.println("D-test2");
		System.out.println(obj.i);
		obj.test1();
	}
	public static void main(String[] args) 
	{
		D d1=new D();
		d1.test2();
	}
} 
//we can cant able to call anything on the null reference. if we call we get NullPointException
/*
D:\java-program-lab\composition\src>java -cp ../classes D
D-test2
Exception in thread "main" java.lang.NullPointerException: Cannot read field "i" because "this.obj" is null
        at D.test2(D.java:15)
        at D.main(D.java:21)*/
