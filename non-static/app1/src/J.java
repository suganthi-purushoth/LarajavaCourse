class J 
{
	void test1()
	{
		System.out.println("from test1");
	}
	static void test2()
	{
		J obj=new J();
		obj.test1();//by using obj reference we are accessing non static test1()
		System.out.println("from test2");
	}
}
/*

D:\java-program-lab\non-static\app1\src>java -cp ../classes J
Error: Main method not found in class J, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/