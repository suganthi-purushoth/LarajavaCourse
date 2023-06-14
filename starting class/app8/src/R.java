class R
{
	public static void main(String[] args) 
	{
		int i=10;
		if(i=10)
		{
			System.out.println("if block:"+i++);
		}
		System.out.println("main end:"+i);
		
	}
}



/*


D:\java-program-lab\app8\src>javac -d ../classes R.java
R.java:6: error: incompatible types: int cannot be converted to boolean
                if(i=10)
                    ^
1 error


/*