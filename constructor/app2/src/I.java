class I 
{
	I()
	{
		//IIB
		//this();
		System.out.println("I()");
	}
	
	{
		System.out.println("IIB1");
	}
	static
	{
		
		System.out.println("SIB");
	}
	
	public static void main(String[] args) 
	{
		I i1=new I();
		System.out.println("--------");
		I i2=new I();
		System.out.println("--------");
		I i3=new I();
		System.out.println("--------");
	}
	
}
//constructor is calling  wise,  IIB is obj wise
//static block executing only one time while class is loading
//IIB block executing only one time while obj is loading

/*

D:\java-program-lab\constructor\app2\src>java -cp ../classes I
SIB
IIB1
I()
--------
IIB1
I()
--------
IIB1
I()
--------


*/