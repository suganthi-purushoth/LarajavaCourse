class C2 
{
	public static void main(String[] args) //elements string type
	//public static void main(char[] args)  accept only char value
	//public static void main(boolean[] args)  accept only boolean value
	//public static void main(int args,double args)  accept only  int double value
	{
		System.out.println("total arguments:"+args.length);
		
		for(String elements:args)
		{
			System.out.println(elements);
		}
		int i=Integer.parseInt(args[0]);//parse=method
		int j=Integer.parseInt(args[1]);
		System.out.println(i);
		System.out.println(j);
	}
}
//Integer.parseInt(args[0])===converting to string value
/*

D:\java-program-lab\command-line-arguments\src>java -cp ../classes C
total arguments:0

D:\java-program-lab\command-line-arguments\src>java -cp ../classes C2 10 20
total arguments:2
stringtype value=10
string type value=20
after converting to int type=10
after converting to int type=20


*/