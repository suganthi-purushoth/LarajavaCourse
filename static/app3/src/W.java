class W 
{
	public static void main(String[] args) 
	{
		System.out.println("W main begin");
		V.main(args);
		System.out.println("W main end");
	}
	static
	{
		System.out.println("W.SIB");
	}
}
/*

D:\java-program-lab\static\app3\src>java -cp ../classes W
W.SIB
W main begin
SIB from V    ==>
main from V
W main end
*/
