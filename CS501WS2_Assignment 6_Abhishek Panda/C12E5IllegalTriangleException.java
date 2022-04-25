/**
 * Class: CS 501-WS2 Introduction to JAVA Programming <br />
 * Instructor: Prof. M Peter Jurkat <br />
 * Question: 12.5 <br />
 * Description: Welcome <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
   <br />
   Signed: Abhishek Panda <br />
   CWID: 10478486
 */
import java.util.Scanner;

public class C12E5IllegalTriangleException {

	public static void main(String[] args) {
		System.out.println(
				"This program lets the user enter 3 sides of a triangle as inputs and then checks for validity and then throws an Exception "
				+"\nThe user can run the program again by entering any number other than 0.\n");
		Scanner input = new Scanner(System.in);
		int option=1;
		while(option!=0){
			try{
				System.out.println("Enter Three Double Side: ");
				double side1 = input.nextDouble();
				double side2 = input.nextDouble();
				double side3 = input.nextDouble();
 
				Triangle triangle=new Triangle( side1, side2, side3);
				System.out.println(triangle.toString());
				System.out.println("Valid triangle sides");
			}
			catch(IllegalTriangleException e)
			{
				System.out.println(e);
			}
			System.out.println("Do you want to continue? Press 0 to exit or otherwise.");
			option = input.nextInt();

		}//end while
	}
}