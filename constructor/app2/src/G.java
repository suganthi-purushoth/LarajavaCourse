class G 
{
	
	{
		System.out.println("IIB1");
	}
	G()
	{
		this(90);
		System.out.println("G()");
	}
	G(int i)
	{
		
		System.out.println("G(int)");
	}
	
	public static void main(String[] args) 
	{
		G g1=new G();
		System.out.println("--------");
		G g2=new G(10);
		System.out.println("--------");
	}
	
}
//constructor is calling  wise,  IIB is obj wise
/*

D:\java-program-lab\constructor\app2\src>java -cp ../classes G
IIB1
G(int)
G()
--------
IIB1
G(int)
--------

*/