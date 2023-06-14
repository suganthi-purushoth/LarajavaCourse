class F 
{
	public static void main(String[] args) 
	{
		String s1=args[0];
		String s2=args[1];
		int i=Integer.parseInt(s1);//int value converting into primitive values
		int j=Integer.parseInt(s2);
		int min=i;//assign 1st value is min
		if(j<i)//checking condition
		{
			min=j;
		}
		System.out.println("min b/w"+i+ "and " +j + "is " +min);
	
	}
}

/*
D:\java-program-lab\command-line-arguments\src>java -cp ../classes F 12 9
min b/w  12  and 9  is  9

D:\java-program-lab\command-line-arguments\src>java -cp ../classes F 20 25
min b/w  20  and 25  is 20
*/