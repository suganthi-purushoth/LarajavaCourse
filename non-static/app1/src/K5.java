class K5 
{
	int j;//this member will be loaded each and every time whenever we are creating object of K5 class, 
	//different copy of the same j will be loaded to the memory with the default value 0.
	
	static int i;//(static member)this member will loading while class K5 is loading to the memory with default vlaue 0.
	//while creating the object for k5 class this member will not be loading again because it is already loaded while K5 class is loading.
	//each and every object of K5 class,all the K5 objects will be sharing the same copy of static int i.
	
	static K5 k5=new K5();
	static K5 k52=new K5();
	
	static
	{
	System.out.println("SIB begin:"+i);
		k5.i=50;
		K5.i=60;
		i=80;
		System.out.println("SIB end:"+i);
	}

	public static void main(String[] args) 
	{
		System.out.println("main:"+i);
		}
}
/*

D:\java-program-lab\non-static\app1\src>java -cp ../classes K5
SIB begin:0
SIB end:50
main:50
*/