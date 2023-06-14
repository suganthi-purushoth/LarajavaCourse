package com.lara.employees;//package declaration
import com.lara.students.StudentsData;//import the another class
public class EmployeesData 
{
	public static void main(String[] args) 
	{
		System.out.println("from com.lara.employees.EmployeesData");
		StudentsData sd1=new StudentsData();
		StudentsData sd2=new StudentsData();
		StudentsData sd3=new StudentsData();
		StudentsData sd4=new StudentsData();
	
	}
	
}
/*
D:\java-program-lab\pack\src>javac -d ../classes com/lara/employees/EmployeesData.java

D:\java-program-lab\pack\src>java -cp ../classes com.lara.employees.EmployeesData
from com.lara.employees.EmployeesData

*/