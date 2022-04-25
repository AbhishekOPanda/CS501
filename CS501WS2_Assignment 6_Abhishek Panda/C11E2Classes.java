/**
 * Class: CS 501-WS2 Introduction to JAVA Programming <br />
 * Instructor: Prof. M Peter Jurkat <br />
 * Question: 11.2 <br />
 * Description: Welcome <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
   <br />
   Signed: Abhishek Panda <br />
   CWID: 10478486
 */

import static javax.swing.JOptionPane.showMessageDialog;

import java.util.Scanner;
public class C11E2Classes {   

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Program Description and Instructions
		System.out.println("The program asks user to enter Details of 5 different Classes that they wants to check. User has to enter a person, student, employee, faculty and staff.\n"
						+ "Person is the parent class. Student and Employee inherit Person. And Faculty and Staff inherit Employee.\n"
						+ "The user can run the program again by entering any number other than 0.\n");
		int option=1;
		//Loop to run the program again until user wants
		while(option!=0){
			Scanner input = new Scanner(System.in);
			Scanner person = new Scanner(System.in);
			Scanner employee = new Scanner(System.in);
			Scanner student = new Scanner(System.in);
			Scanner faculty = new Scanner(System.in);
			Scanner staff = new Scanner(System.in);
			
			System.out.println("Enter details for a person:");
			
			System.out.println("Enter Name:");
			String pname = person.nextLine();
			System.out.println("Enter Address:");
			String padd = person.nextLine();
			System.out.println("Enter Phone:");
			String pphone = person.nextLine();
			System.out.println("Enter Email:");
			String pemail = person.nextLine();
			Person person1 = new Person(pname, padd, pphone, pemail);
			
			System.out.println("Enter details for a Student:");
			
			System.out.println("Enter Id:");
			String sid = student.nextLine();
			System.out.println("Enter Name:");
			String sname = student.nextLine();
			System.out.println("Enter Address:");
			String saddress = student.nextLine();
			System.out.println("Enter Phone:");
			String sphone = student.nextLine();
			System.out.println("Enter Email:");
			String semail = student.nextLine();
			System.out.println("Enter Status:");
			int sstatus = student.nextInt();
			Student student1 = new Student(sid, sname, saddress, sphone, semail, sstatus);
			
			System.out.println("Enter details for an Employee:");
			
			System.out.println("Enter ID:");
			String eid = employee.nextLine();
			System.out.println("Enter Name:");
			String ename = employee.nextLine();
			System.out.println("Enter Address:");
			String eaddress = employee.nextLine();
			System.out.println("Enter Phone:");
			String ephone = employee.nextLine();
			System.out.println("Enter Email:");
			String eemail = employee.nextLine();
			System.out.println("Enter Office:");
			String eoffice = employee.nextLine();
			System.out.println("Enter Salary:");
			double esalary = employee.nextInt();
			Employee employee1 = new Employee(eid, ename, eaddress, ephone, eemail, eoffice, esalary);
			
			System.out.println("Enter details for an Faculty:");
			
			System.out.println("Enter ID:");
			String fid = faculty.nextLine();
			System.out.println("Enter Name:");
			String fname = faculty.nextLine();
			System.out.println("Enter Address");
			String faddress = faculty.nextLine();
			System.out.println("Enter Phone Number:");
			String fphone = faculty.nextLine();
			System.out.println("Enter Email:");
			String femail = faculty.nextLine();
			System.out.println("Enter Office:");
			String foffice = faculty.nextLine();
			System.out.println("Enter Office hours:");
			String fofficeHours =faculty.nextLine();
			System.out.println("Enter Rank:");
			String frank = faculty.nextLine();
			System.out.println("Enter Salary:");
			double fsalary = faculty.nextInt();

			Faculty faculty1 = new Faculty(fid, fname, faddress, fphone, femail, foffice, fofficeHours, frank, fsalary);
			
			System.out.println("Enter details for an Staff:");
			
			System.out.println("Enter Id:");
			String stid = staff.nextLine();
			System.out.println("Enter Name:");
			String stname = staff.nextLine();
			System.out.println("Enter Address:");
			String staddress = staff.nextLine();
			System.out.println("Enter Phone:");
			String stphone = staff.nextLine();
			System.out.println("Enter Email:");
			String stemail = staff.nextLine();
			System.out.println("Enter Office:");
			String stoffice = staff.nextLine();
			System.out.println("Enter Title");
			String sttitle =  staff.nextLine();
			System.out.println("Enter Salary:");
			double stsalary = staff.nextInt();
			Staff staff1 = new Staff(stid, stname, staddress, stphone, stemail, stoffice, sttitle, stsalary);

			try {
				person1.numberCheck(pphone);
				person1.isValidEmail(pemail);
				System.out.println(person1.toString());
			}
			catch (Person.InvalidNumberException ex1) {
				System.out.println("\nCaught an exception with number. Details of "+ person1.printName()+" is not printed because," + ex1.getMessage());
			}
			catch (Person.InvalidEmailException ex2) {
				System.out.println("\nCaught an exception with Email. Details of "+ person1.printName()+" is not printed because," + ex2.getMessage());
			}
			
			try {
				student1.numberCheck(sphone);
				student1.isValidEmail(semail);
				System.out.println(student1.toString());
			}
			catch (Person.InvalidNumberException ex1) {
				System.out.println("\nCaught an exception with number. Details of "+ student1.printName()+" is not printed because," + ex1.getMessage());
			}
			catch (Person.InvalidEmailException ex2) {
				System.out.println("\nCaught an exception with Email. Details of "+ student1.printName()+" is not printed because," + ex2.getMessage());
			}
			
			try {
				employee1.salaryCheck(esalary);
				employee1.numberCheck(ephone);
				employee1.isValidEmail(eemail);
				System.out.println(employee1.toString());
			}
			catch (Person.InvalidSalaryException ex) {
				System.out.println("\nCaught an exception with Salary. Details of "+ employee1.printName()+" is not printed because," + ex.getMessage());
			}
			catch (Person.InvalidNumberException ex1) {
				System.out.println("\nCaught an exception with number. Details of "+ employee1.printName()+" is not printed because," + ex1.getMessage());
			}
			catch (Person.InvalidEmailException ex3) {
				System.out.println("\nCaught an exception with Email. Details of "+ employee1.printName()+" is not printed because," + ex3.getMessage());
			}
			
			try {
				faculty1.salaryCheck(fsalary);
				faculty1.numberCheck(fphone);
				faculty1.isValidEmail(femail);
				System.out.println(faculty1.toString());
			}
			catch (Person.InvalidSalaryException ex) {
				System.out.println("\nCaught an exception with Salary. Details of "+ faculty1.printName()+" is not printed because," + ex.getMessage());
			}
			catch (Person.InvalidNumberException ex1) {
				System.out.println("\nCaught an exception with number. Details of "+ faculty1.printName()+" is not printed because," + ex1.getMessage());
			}
			catch (Person.InvalidEmailException ex3) {
				System.out.println("\nCaught an exception with Email. Details of "+ faculty1.printName()+" is not printed because," + ex3.getMessage());
			}
			
			try {
				staff1.salaryCheck(stsalary);
				staff1.numberCheck(stphone);
				staff1.isValidEmail(stemail);
				System.out.println(staff1.toString());
			}
			catch (Person.InvalidSalaryException ex) {
				System.out.println("\nCaught an exception with Salary. Details of "+ staff1.printName()+" is not printed because," + ex.getMessage());
			}
			catch (Person.InvalidNumberException ex1) {
				System.out.println("\nCaught an exception with number. Details of "+ staff1.printName()+" is not printed because," + ex1.getMessage());
			}
			catch (Person.InvalidEmailException ex3) {
				System.out.println("\nCaught an exception with Email. Details of "+ staff1.printName()+" is not printed because," + ex3.getMessage());
			}
			
			System.out.println("Do you want to continue? Press 0 to exit or otherwise.");
			option = input.nextInt();

		}//end while
	}
}