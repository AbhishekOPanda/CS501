/**
 * Class: CS 501-WS2 Introduction to JAVA Programming <br />
 * Instructor: Prof. M Peter Jurkat <br />
 * Question: 2.19 <br />
 * Description: Geometry: area of a triangle <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
   <br />
   Signed: Abhishek Panda <br />
   CWID: 10478486
 */

import java.util.Scanner; // importing scanner class
import static javax.swing.JOptionPane.showMessageDialog; //importing jOptionPane class

public class C2E19TriangleArea {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in); // Scanner object 'input' created
		
		double [] x = new double [3]; 		//Arrays to hold the x-coordinates of 3 points
		double [] y = new double [3];		//Arrays to hold the y-coordinates of 3 points
		double [] s = new double [3];	//Holds length between each point of the triangle
		double area = 0.0;
		
		//Program Description and Instructions
		showMessageDialog(null,"The program asks user to enter 3 coordinates and find the area of the triangle created by it.\n"
				+ "Coordinates can be positive or negative and decimals or integers and are seperated by a space.\n"
				+ "The input is taken for each coordinate with a space in between. Press the 'Enter' key once both the coordinates are entered.");
		
		//Taking in x and y Values from User
		for(int i = 0; i < x.length; i++)
		{
			System.out.print("Enter x"+(i+1)+" and y"+(i+1)+": ");
			x[i] = input.nextDouble();
			y[i] = input.nextDouble();
		}
		
		//Calculating Length between each Coordinate 
		//Echoing User Input of Coordinate Values
		for (int i = 0; i < x.length; i++)
		{
			showMessageDialog(null,"Coordinate "+(i+1)+": ("+x[i]+", "+y[i]+")"); //Echo user input for coordinate values

		}
		
		//Calculating the side lengths
		double a = (x[1] - x[0]);
        double b = (y[1] - y[0]);

        s[0] = Math.sqrt(Math.abs((a * a) + (b * b)));
        a = (x[2] - x[1]);
        b = (y[2] - y[1]);

        s[1] = Math.sqrt(Math.abs((a * a) + (b * b)));

        a = (x[0] - x[2]);
        b = (y[0] - y[2]);

        s[2] = Math.sqrt(Math.abs((a * a) + (b * b)));
		
        //Calculating the sum of the sides and dividing it by 2
        double sum = (s[0] + s[1] + s[2]) / 2;
        
        //Calculating the area of triangle with by the given formula.
        area = Math.sqrt(sum * (sum - s[0]) * (sum - s[1]) * (sum - s[2]));
		
        //Length display and Area calculation
		for (int i = 0; i < x.length; i++)
		{
			showMessageDialog(null,"Length of Side"+(i+1)+": "+s[i]); //Display Length of each side
		}	
		
		if(area>0) {
			System.out.print(area);
			//Displaying Area Calculation
			showMessageDialog(null,"Cordinate 1: ("+x[0]+","+y[0]+")\n"
					+ "Cordinate 2: ("+x[1]+","+y[1]+")\n"
					+ "Cordinate 1: ("+x[2]+","+y[2]+")\n"
					+ "The Area of the Triangle is: "+area);		
			}
		else if(area == 0) {
			showMessageDialog(null, "The 3 points are co-linear");
			}
		else {
			showMessageDialog(null, "Error: area cannot be negative");
			}
	}
}
