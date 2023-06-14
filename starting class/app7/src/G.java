class G 
{
	public static void main(String[] args) 
	{
		if(args.length==0)
		{
			System.out.println("pls supply one command line arg");
				return;
		}
		int i=Integer.parseInt(args[0]);
		System.out.println(Math.sqrt(i));
	}
}


/*


D:\java-program-lab\app7\src>javac -d ../classes G.java

D:\java-program-lab\app7\src>java -cp ../classes  G
pls supply one command line arg

D:\java-program-lab\app7\src>java -cp ../classes  G  34
5.830951894845301


/*