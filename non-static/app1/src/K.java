class K 
{
	int i;
	static
	{
		K k1=new K();
		System.out.println(k1.i);
	}
}
//non static mem cannot be reference with out ref var
//ststic block also comes under static constant or static area
/*

D:\java-program-lab\non-static\app1\src>java -cp ../classes K
Error: Main method not found in class K, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application*/