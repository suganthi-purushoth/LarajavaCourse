class L 
{
	void test1()
	{
		System.out.println("from test1");
	}
	static
	{
		L obj=new L();//obj create any where
		obj.test1();
	}
}
/*

syntatically proper
D:\java-program-lab\non-static\app1\src>java -cp ../classes L
Error: Main method not found in class L, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/
