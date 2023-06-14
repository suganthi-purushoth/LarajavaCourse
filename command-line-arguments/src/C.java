class C 
{
	public static void main(String[] args) 
	{
		System.out.println("total arguments:"+args.length);
		for(String arg :args)
		{
			System.out.println(arg);//not null passing empty string array obj
		}

	}
}
//JVM will be calling the main method by supplying empty string array object 
          //if you dont supply anything as a command line argument while executing any class.
//if you directly print the array reference you will be getting the memory address of that array object.
//each and every array will be having a length.we can find out the array length by using 'length'properly(by calling length property on the array reference).
//arrays are also objects in java.
//array index will be starting from 0 but length we will calculate from no.1.
//if there are no elements are present in the array then we can say that array is empty or (size or length is 0).
//by default whatever value you are supplying as command line argument that will be considered as string type only.



/*

D:\java-program-lab\command-line-arguments\src>java -cp ../classes C
total arguments:0


D:\java-program-lab\command-line-arguments\src>java -cp ../classes C suga pu
vi kavi purushoth
total arguments:4
suga
puvi
kavi
purushoth

*/