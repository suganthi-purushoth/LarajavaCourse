class  A
{
	//data (non static)members
	private String name;//private members cannot be access onother class
	private int rollNumber;
	private int age;

	//read-only //getter methods
	//getter and setter method must be declared as public
	public String getName()
	{
		return name;//this.getName;(both are same)
	}
	public int getRollNumber()
	{
		return rollNumber;//this.rollNumber;
	}
	public int getAge()
	{
		return age;//this.age;
	}
}
	class DriverClass1
{
		public static void main(String[] args) 
		{
			A a1=new A();
			System.out.println(a1.getName());//outside the class not directly access to a1.name,we can use methods
			System.out.println(a1.getRollNumber());
			System.out.println(a1.getAge());
		}
}
/*
getter methods:read only

D:\java-program-lab\encapsulation\src>java -cp ../classes DriverClass1
null
0
0*/