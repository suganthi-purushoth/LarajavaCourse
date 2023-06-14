class E2
{
	public static void main(String[] args) 
	{
		boolean i=Boolean.parseBoolean(args[0]);
		
		System.out.println(i);
	}
}
/*
D:\java-program-lab\command-line-arguments\src>java -cp ../classes E2 TRUE
true

D:\java-program-lab\command-line-arguments\src>java -cp ../classes E2 true
true

D:\java-program-lab\command-line-arguments\src>java -cp ../classes E2 suga
false

D:\java-program-lab\command-line-arguments\src>java -cp ../classes E2 TruE
true

D:\java-program-lab\command-line-arguments\src>java -cp ../classes E2 tRUe
true

D:\java-program-lab\command-line-arguments\src>java -cp ../classes E2 FALSE
false

D:\java-program-lab\command-line-arguments\src>java -cp ../classes E2 false
false
*/