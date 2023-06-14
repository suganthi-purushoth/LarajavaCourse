class L 
{
	public static void main(String[] args) 
	{
		if(args.length<3)
		{
			System.out.println("supply 3 command line arguments");
			return;
		}
		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);
		int k=Integer.parseInt(args[2]);
		int min = i < j  ?  (i < k ? i : k) : (j < k ? j : k);
		System.out.println("min b/w"+i+ "and" +j + "and " +k+"is" +min);
	}
}

//i<j==outer ternary operation

//i<k?i:k     ===>one expresstion  ===> nested operator
//(j < k ? j : k);==>onother expresstion



// i=10,j=20,k=30.

//D:\java-program-lab\if-else\app4\src>java -cp ../classes L
//supply 3 command line arguments

//D:\java-program-lab\if-else\app4\src>java -cp ../classes L 10 20 30
//min b/w10and20is 10