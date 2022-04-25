/**
 * Class: CS 501-WS2 Introduction to JAVA Programming <br />
 * Instructor: Prof. M Peter Jurkat <br />
 * Question: 3.27 <br />
 * Description: Geometry: points in triangle? <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
   <br />
   Signed: Abhishek Panda <br />
   CWID: 10478486
 */

import java.util.Scanner;
import static javax.swing.JOptionPane.showMessageDialog;

public class C3E27PointsInTriangle {
	public static void main(String[] args) {
		
		// Initializing the given triangle coordinates
		double x1 = 0, y1 = 0;		//coordinates of point 1
		double x2 = 0, y2 = 100;	//coordinates of point 2
		double x3 = 200, y3 = 0;	//coordinates of point 3
		
		// Program description
		System.out.println("The program takes coordinates from user of a point and determines whether the point is inside the given triangle.\n"
				+ "Cordinates of the given triangle:   Point 1 = (0, 0);   Point 2 = (0, 100);   Point 3 = (200, 0)\n"
				+ "Coordinates can be positive or negative and decimals or integers and are seperated by a space.\n"
				+ "The input(x and y) is taken for coordinate with a space in between. Press the 'Enter' key once both the coordinates are entered.");
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a point with x and y coordinates
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		// Calculating the dot product of all points with user input
		double dot1 = (y2 - y1)*(x - x1) + (-x2 + x1)*(y - y1);
		double dot2 = (y3 - y2)*(x - x2) + (-x3 + x2)*(y - y2);
		double dot3 = (y1 - y3)*(x - x3) + (-x1 + x3)*(y - y3);
		
		// This prints "is in the triangle" only when all the dot products are positive else prints "is not in the triangle"
		showMessageDialog(null,"The point " + ((dot1>=0 && dot2>=0 && dot3>=0)
				? "is " : "is not " ) + "in the triangle");
	}
}
