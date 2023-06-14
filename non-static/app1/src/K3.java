class K3
{
	int i;
	
	static
	{
		
		System.out.println("static:"+k3.i);
	}
	static K3 k3=new K3();

}
//non static mem cannot be reference with out ref var
//ststic block also comes under static constant or static area


/*

D:\java-program-lab\non-static\app1\src>javac -d ../classes K3.java
K3.java:8: error: illegal forward reference
                System.out.println("static:"+k3.i);
                                             ^
1 error

*/
	
