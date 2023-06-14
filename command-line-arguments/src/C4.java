class C4 
{
	public static void main(String[] args) 
	{
		System.out.println("total arguments:"+args.length);
		System.out.println("-------------------");
		char c1=Character.parseChar(args[0]);

	}
}
//there is no method for converting from string to char 
//we cant able to convert from string to char
//but we can convert from char to string
/*
D:\java-program-lab\command-line-arguments\src>javac -d ../classes C4.java
C4.java:7: error: cannot find symbol
                char c1=Character.parseChar(args[0]);
                                 ^
  symbol:   method parseChar(String)
  location: class Character
1 error
*/