class K 
{
	public static void main(String[] args) 
	{
		if(args.length<2)
		{
			System.out.println("supply 2 command line arguments");
			return;
		}
		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);
		int min=i<j ? i:j;
		System.out.println("min b/w"+i+ "and" +j + "is " +min);
	}
}

//
//D:\css\app4\src>javac -d ../classes K.java

//D:\css\app4\src>java -cp ../classes K
//supply 2 command line arguments

//D:\css\app4\src>java -cp ../classes K 10 20
//min b/w 10 and 20 and 30 is 10

