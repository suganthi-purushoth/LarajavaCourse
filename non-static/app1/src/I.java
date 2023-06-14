class I 
{
	int x;
	static void test()
	{
		I rv=new I();
		System.out.println(rv.x);
	}
}
//in the static user defined method also we can create the objects.

/*
D:\java-program-lab\non-static\app1\src>java -cp ../classes I
Error: Main method not found in class I, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/