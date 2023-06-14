class O2 
{
	public static void main(String[] args) 
	{
		O2 o1=new O2();
		System.out.println(o1);
		o1=new O2();
		System.out.println(o1);
	}
}
//any object which is not having at least one reference is called as abandoned object.
//abandoned objects are not having any reference.
//if none of the references are pointing to an objects,that object is called as abandoned object.



/*
D:\java-program-lab\non-static\app1\src>java -cp ../classes O2
O2@372f7a8d
O2@2f92e0f4
*/