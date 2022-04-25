/**
 * Class: CS 501-WS2 Introduction to JAVA Programming <br />
 * Instructor: Prof. M Peter Jurkat <br />
 * Question: 4.2 <br />
 * Description: Geometry: great circle distance <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
   <br />
   Signed: Abhishek Panda <br />
   CWID: 10478486
 */

import java.util.Scanner;
import static javax.swing.JOptionPane.showMessageDialog;
import java.lang.Math;

public class C4E2CircleDistance {
	public static void main(String[] args) {
		
		// Program description
		System.out.println("The program asks the user to enter the latitude and longitude of two points on the earth in degrees and displays its great circle distance.\n"
			+ "Coordinates are positive for North and West and negative for South and East, and cordicantes can be decimals or integers and are seperated by a space.\n"
			+ "Press the 'Enter' key once the latitude and longitude for both the coordinates are entered.");
		
		// Create a Scanner class
		Scanner input = new Scanner(System.in);
	
		// Fixing Radius of earth to constant value
		final double RADIUS = 6371.01;	
	
		// Taking input from user
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		String point1 = input.nextLine();
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		String point2 = input.nextLine();
		
		// Taking space as breaking point and separating both points to store value for x and y 
		int k = point1.indexOf(' ');
		double x1 = Double.parseDouble(point1.substring(0, k));
		double y1 = Double.parseDouble(point1.substring(k + 1));
		k = point2.indexOf(' ');
		double x2 = Double.parseDouble(point2.substring(0, k));
		double y2 = Double.parseDouble(point2.substring(k + 1));
	
		// Converting degrees to radians
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		
		// Calculate great circle distance using the given formula
		double distance = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + 
				Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
	
		// Display result in the Dialog box
		showMessageDialog(null,"The distance between the two points is " + distance + " km");
	}
}