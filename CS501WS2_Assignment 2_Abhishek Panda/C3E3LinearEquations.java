/**
 * Class: CS 501-WS2 Introduction to JAVA Programming <br />
 * Instructor: Prof. M Peter Jurkat <br />
 * Question: 3.3 <br />
 * Description: Algebra: solve 2 * 2 linear equations <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
   <br />
   Signed: Abhishek Panda <br />
   CWID: 10478486
 */

import java.util.Scanner;
import static javax.swing.JOptionPane.showMessageDialog;

public class C3E3LinearEquations {
	public static void main(String[] args) {
		
		// Program description
		System.out.println("The program uses Cramer's rule to find the solution of a 2 X 2 linear equation.\n"
				+ "Enter the values of a, b, c, d, e & f with a space in-between or just enter the value one by one.\n"
				+ "Press the 'Enter' key once all values are entered.\n"
				+ "Format of linear equation:\n     ax + by = e\n     cx + dy = f");
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Taking user input
		System.out.print("Enter a, b, c, d, e & f: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		// Condition to check whether  a*d – b*c is 0
		if ((a*d - b*c) == 0)	
			showMessageDialog(null,"The equation has no solution.");
		else {
			// Calculating the value of x and y
			double x = (e*d - b*f)/(a*d - b*c);
			double y = (a*f - e*c)/(a*d - b*c);
			
			// Printing solution in a dialog box
			showMessageDialog(null,"Solving linear equation\n"
					+ "      " + a + "x + " + b + "y = " + e + ";\n"
					+ "      " + c + "x + " + d + "y = " + f + ";\n"
					+ "using Cramer's rule:\n"
					+ "      x is " + x + " and y is " + y);
		}
	}
		
}
