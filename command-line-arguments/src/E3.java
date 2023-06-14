class E3
{
	public static void main(String[] args) 
	{
		boolean i=Boolean.parseBoolean(args[0]);
		
		System.out.println(i);
		String a1="suga";
		String a2="purushoth";
		
		boolean b1=true;
		boolean b2=TRUE;
	}
}
/*
D:\java-program-lab\command-line-arguments\src>javac -d ../classes E3.java
E3.java:12: error: cannot find symbol
                boolean b2=TRUE;
                           ^
  symbol:   variable TRUE
  location: class E3
1 error
*/