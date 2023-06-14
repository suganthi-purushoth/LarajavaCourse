class H 
{
	public static void main(String[] args) 
	{
		for (String s1:args)
		{
		System.out.println(s1);
	}
}
}



/*


D:\java-program-lab\app7\src>java -cp ../classes H

D:\java-program-lab\app7\src>java -cp ../classes H 23
23

D:\java-program-lab\app7\src>java -cp ../classes H 23 644
23
644

D:\java-program-lab\app7\src>java -cp ../classes H 23 644 hello
23
644
hello

D:\java-program-lab\app7\src>java -cp ../classes H 23 abc hello "lara tech"   //supply space part of the argument by using ""  
23
abc
hello
lara tech

/*
