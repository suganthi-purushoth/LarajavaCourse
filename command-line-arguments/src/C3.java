class C3 
{
	public static void main(String[] args) //elements string type
	
   {
		System.out.println("total arguments:"+args.length);
		System.out.println("still in the string datatype not converted");
		for(String elements:args)
		{
			System.out.println(elements);
		}
		System.out.println("after conversion");
		double i=Double.parseDouble(args[0]);
		double j=Double.parseDouble(args[1]);
		System.out.println(i);
		System.out.println(j);
	}
}
/*
int value automatically changing to double         

D:\java-program-lab\command-line-arguments\src>java -cp ../classes C3 10 20
total arguments:2
still in the string datatype not converted
10
20
after conversion
10.0
20.0

*/