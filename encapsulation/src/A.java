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
class DriverClass
{
		public static void main(String[] args) 
		{
			A a1=new A();
			System.out.println(a1.getName());
			System.out.println(a1.getRollNumber());
			System.out.println(a1.getAge());

		}

	
}
//static variable or non static variable=data members(data)
//static methods or non static methods=member functions(code)
//write only=you can change the data
//read only=you cannot change the data
//we can to use getter and setter () use indirectly
/*
ENCAPSULATION:
-------------
1.Encapsulation in java is a process of wrapping code and data together into a single unit(one unit),for example,a capsule which is mixed of several medicines.
-we can able to achive data security through encapsulation
-we can achive data hiding
-by using getters and setters we can make the data ready-only or write-only
-by using getters and setters we can have control over the data.
2.we can create a fully encapsulated class in java by making all the data members of the class private.
3.By providing only a setter or getter method,you can make the class read-only or write-only.In other words,you can skip the getter or setter methods.
4.It provides you the control over the data.suppose you want to set the value of id which should be greater than 100 only ,you can write the logic inside the


D:\java-program-lab\encapsulation\src>javac -d ../classes A.java
A.java:13: error: name has private access in A
                        System.out.println(a1.name);
                                             ^
A.java:14: error: rollNumber has private access in A
                        System.out.println(a1.rollNumber);
                                             ^
A.java:15: error: age has private access in A
                        System.out.println(a1.age);
                                             ^
3 errors*/