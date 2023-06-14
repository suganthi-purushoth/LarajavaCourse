import java.util.Scanner;
class I
{
	public static void main(String[] args) 
	{
		System.out.println("please enter student information:");
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter student roll-number:");
		int roll_number=sc.nextInt();
		sc.nextLine();
		System.out.println("please enter student first last name:");
		String name=sc.nextLine();

		System.out.println("please enter student initials:");
		char initials=sc.next().charAt(0);

		System.out.println("please enter student age:");
		int age=sc.nextInt();
				sc.nextLine();

		System.out.println("please enter student enrolles course:");
		String course=sc.next();
		sc.nextLine();

		System.out.println("please enter student Skills:");
		String skills=sc.nextLine();
				sc.nextLine();

		System.out.println("please enter student total fee");
		double fees=sc.nextDouble();
				sc.nextLine();

		System.out.println("please enter Student job offer status");
		boolean job_offer=sc.nextBoolean();
		sc.nextLine();
		System.out.println("------------------------------------------------");

		System.out.println("Student details:\n"+"roll_number:\n"+roll_number+"first_last_name:\n"+first_last_name+"initials:\n"+initials+
						"age:\n"+age+"course:\n"+course+"skills:\n"+skills+"fees:\n"+fees+"job_offer:\n"+job_offer);

		}
}
//byte <short<int<long<float<double

/*
D:\java-program-lab\scanner-class\src>java -cp ../classes I
please enter student information:
please enter student roll-number:
12
please enter student first last name:
suga
please enter student initials:
p
please enter student age:
30
please enter student enrolles course:
java
please enter student Skills:
java c++

please enter student total fee
50000
please enter Student job offer status
false
------------------------------------------------
Student details:
roll_number:
12first_last_name:
sugainitials:
page:
30course:
javaskills:
java c++fees:
50000.0job_offer:
false
*/