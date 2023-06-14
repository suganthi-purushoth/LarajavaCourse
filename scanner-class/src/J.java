import java.util.Scanner;
class J
{
	public static void main(String[] args) 
	{
		System.out.println("please enter student information:");
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter student roll-number:");
		int roll_number=sc.nextInt();
		//sc.nextLine();
		System.out.println("please enter student first last name:");
		String name=sc.nextLine();

		System.out.println("please enter student initials:");
		char initials=sc.next().charAt(0);

		System.out.println("please enter student age:");
		int age=sc.nextInt();
			//	sc.nextLine();

		System.out.println("please enter student enrolles course:");
		String course=sc.next();
//		sc.nextLine();

		System.out.println("please enter student Skills:");
		String skills=sc.nextLine();
//				sc.nextLine();

		System.out.println("please enter student total fee");
		double fees=sc.nextDouble();
			//	sc.nextLine();

		System.out.println("please enter Student job offer status");
		boolean job_offer=sc.nextBoolean();
		//sc.nextLine();
		System.out.println("------------------------------------------------");

		System.out.println("Student details:\n"+"roll_number:\n"+roll_number+"first_last_name:\n"+name+"initials:\n"+initials+
						"age:\n"+age+"course:\n"+course+"skills:\n"+skills+"fees:\n"+fees+"job_offer:\n"+job_offer);

		}
}
//byte <short<int<long<float<double

/*

D:\java-program-lab\scanner-class\src>java -cp ../classes J
please enter student information:
please enter student roll-number:
2
please enter student first last name:
please enter student initials:
p
please enter student age:
20
please enter student enrolles course:
java
please enter student Skills:
please enter student total fee
40000
please enter Student job offer status
false
------------------------------------------------
Student details:
roll_number:
2first_last_name:
initials:
page:
20course:
javaskills:
fees:
40000.0job_offer:
false
*/