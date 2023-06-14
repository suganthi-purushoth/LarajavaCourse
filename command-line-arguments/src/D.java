class D 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String s1=args[0];
		System.out.println("-----11-----");
		String s2=args[1];
		System.out.println("-----22-----");
		String s3=args[2];
		System.out.println("-----33-----");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("main end");
	}
}
//create 4 not accessing only printing 3 values(s1,s2,s3)
/*
(i)D:\java-program-lab\command-line-arguments\src>java -cp ../classes D puvi k
avi
main begin
-----11-----
-----22-----
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
        at D.main(D.java:10)
---------------------------------------------------------------------------------------
(ii)
D:\java-program-lab\command-line-arguments\src>java -cp ../classes D puvi kavi suga
main begin
-----11-----
-----22-----
-----33-----
puvi
kavi
suga
main end
*/