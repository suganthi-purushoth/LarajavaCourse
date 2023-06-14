class Student
{
		int roll_number;
		String name;
		String college_name;//initial null
		String course;
		Student(int roll_number,String name)
		{
		this.roll_number=roll_number;
		this.name=name;//calling name
	}

	{
		this.college_name="Lara";
	}
	{
		this.course="java Full-stack";
	}
	public static void main(String[] args) 
	{
		Student s1=new Student(101,"Puvisha");
		System.out.println(s1.roll_number+","+s1.name+","+s1.college_name+","+s1.course);
		System.out.println("-----------");
		Student s2=new Student(102,"Kavin");
		System.out.println(s2.roll_number+","+s2.name+","+s2.college_name+","+s2.course);
		System.out.println("-----------");
		Student s3=new Student(103,"Vishva");
		System.out.println(s3.roll_number+","+s3.name+","+s3.college_name+","+s3.course);
		System.out.println("-----------");
		Student s4=new Student(104,"Mohith");
		System.out.println(s4.roll_number+","+s4.name+","+s4.college_name+","+s4.course);
		System.out.println("-----------");
		
		}
}
/*

D:\java-program-lab\constructor\app2\src>java -cp ../classes Student
101,Puvisha,Lara,java Full-stack
-----------
102,Kavin,Lara,java Full-stack
-----------
103,Vishva,Lara,java Full-stack
-----------
104,Mohith,Lara,java Full-stack
-----------
*/