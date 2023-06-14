class K2 
{
	int i;
	static K2 k2=new K2();
	static
	{
		
		System.out.println(k2.i);
	}
}
//non static mem cannot be reference with out ref var
//ststic block also comes under static constant or static area
/*


D:\java-program-lab\non-static\app1\src>java -cp ../classes K2
Error: Main method not found in class K2, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/