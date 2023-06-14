class  A
{
	//string[] args ={};  show the memory location where the obj is available
	public static void main(String[] args) 
	{
		System.out.println("Hello World!:"+args);
	}
}
//main() called by the jvm
//directly cannot passed by the value
//System=lang package

/*
D:\java-program-lab\command-line-arguments\src>java -cp ../classes A
Hello World!:[Ljava.lang.String;@372f7a8d
*/