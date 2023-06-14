class F1
{
	int i;
	F(int i)
	{
		this.i=10;//this represents current obj
		System.out.println("F(int)");
	}
	public static void main(String[] args) 
	{
		F f1=new F(10);//no argument constructor not available
		System.out.println(f1.i);
	}
}
