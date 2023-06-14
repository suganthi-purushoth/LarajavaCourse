class K4
{
	static int i;
	
	static
	{
		K4 k4=new K4();
		System.out.println("static:"+k4.i);
	}
}

//each and every static member (static ver and static methods)will be shared by all the objects of that class.
//static int i will be not loaded while creating the object to k4 class,
		//bcz it its already loaded while K4 cls is loadin.K4 object  is just using the already loaded static int i.
		//even the future objects of all K4 class will be using the same copy of static int i.
/*

D:\java-program-lab\non-static\app1\src>java -cp ../classes K4
Error: Main method not found in class K4, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/