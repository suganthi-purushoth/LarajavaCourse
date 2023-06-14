class C5
{
	public static void main(String[] args) 
	{
		System.out.println("total arguments:"+args.length);
		System.out.println("-------------------");
		//how to convert from string to char
		//-------------------------------------
		//its not converting from string to char
		//its just fetching values from a particular string index
		//we cant convert string to char
		String s1=args[0];
		char c1=args[0].charAt(0);//char return primitive value
		System.out.println(c1);
	}
}
//internally strings are also array of characters,and will be having indexes.index starts from 0.

/*
D:\java-program-lab\command-line-arguments\src>java -cp ../classes C5 a
total arguments:1
-------------------
a*/