class O 
{
	O()
	{
		this(10);
		System.out.println("O()");
	}
	O(int i)
	{
		System.out.println("O(int)");
	}
	public static void main(String[] args) 
	{
		O o1=new O();
		System.out.println("-----------");
		O o2=new O(20);
		System.out.println("-----------");
	}
}
/*
D:\java-program-lab\constructor\app1\src>java -cp ../classes O
O(int)
O()
-----------
O(int)
-----------*/