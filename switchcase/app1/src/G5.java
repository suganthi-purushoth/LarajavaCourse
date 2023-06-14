class G5
{
	public static void main(String[] args) 
	{
		if(true)
		{

			default;
		}
				System.out.println("from default");

				
	}
}
/*


D:\java-program-lab\switchcase\app1\src>javac -d ../classes G5.java
G5.java:8: error: orphaned default
                        default;
                        ^
G5.java:8: error: : or -> expected
                        default;
                               ^
*/