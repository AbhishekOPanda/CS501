/**
 * Class: CS 501-WS2 Introduction to JAVA Programming <br />
 * Instructor: Prof. M Peter Jurkat <br />
 * Question: 2.15 <br />
 * Description: Geometry: distance of two points <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
   <br />
   Signed: Abhishek Panda <br />
   CWID: 10478486
 */

import java.util.Scanner; // importing scanner class
import static javax.swing.JOptionPane.showMessageDialog; //importing jOptionPane class

public class C2E15DistanceFormula {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner object 'input' created
		double [] x = new double [2];
		double [] y = new double [2];
		
		//Program description with instructions
		showMessageDialog(null,"The Program allows you to find the distance between two points (x1,y1) and (x2,y2)\n"
				+ "Coordinates can be positive or negative and decimals or integers.\n"
				+ "The input is taken for each coordinate with a space in between. Press the 'Enter' key once both the coordinates are entered.");
		
		//Loop to take in the x and y values for the two coordinates
		for(int i = 0; i < x.length; i++)
		{
			System.out.print("Enter x"+(i+1)+" and y"+(i+1)+": ");
			x[i] = input.nextDouble();
			y[i] = input.nextDouble();
		}
		//Finding the distance with the distance formula:Square root of sum of the squared differences
		double dist = Math.pow(Math.pow((x[1] - x[0]), 2) + Math.pow((y[1] - y[0]), 2),0.5); 
		
		//Verifying Output through if-else loop
		if(dist > 0) {
			//Displaying final answer with user input coordinates
			showMessageDialog(null,"The distance between the two points:\n"
					+ "Coordinate 1: ("+x[0]+", "+y[0]+")\n"
					+ "Coordinate 2: ("+x[1]+", "+y[1]+")\n"
					+ "=" + dist); 
		}
		else {
			//Displaying error message with user input coordinates
			showMessageDialog(null,"\t\tCoordinate 1: ("+x[0]+", "+y[0]+")\n"
					+ "\t\tCoordinate 2: ("+x[1]+", "+y[1]+")\n"
					+ "Erorr: Distance cannot be 0 or negative in value!!!");
		}	
	}
}
