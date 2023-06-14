class  V
{
	int i;
	static V test()//method return type can be class type
	{
		return new V();//while returning also we can creating a obj its possible
	}
	public static void main(String[] args) 
	{
		V v1=test();//test method now having V class object
		System.out.println(v1.i);
	}
}
//if you find anywhere 'new' then definately if is creation of object only


/*
D:\java-program-lab\non-static\app1\src>java -cp ../classes V
0
*/