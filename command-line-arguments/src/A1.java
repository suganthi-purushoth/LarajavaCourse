class  A1
{
	//string[] args ={};  show the memory location where the obj is available
	public static void main(String[] args) 
	{
		System.out.println("Hello World!:"+args.length);
	}
}
//main() called by the jvm
//directly cannot passed by the value
//System=lang package

/*
D:\java-program-lab\command-line-arguments\src>java -cp ../classes A1
Hello World!:0
*/