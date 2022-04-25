/**
 * Class: CS 501-WS2 Introduction to JAVA Programming <br />
 * Instructor: Prof. M Peter Jurkat <br />
 * Question: 9.1 <br />
 * Description: Welcome <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
   <br />
   Signed: Abhishek Panda <br />
   CWID: 10478486
 */

import java.util.Scanner;

public class C9E1RectangleTest {
	public static void main(String[] args) throws Exception {
		System.out.println("This program tests the values given in the question.");
		Scanner input = new Scanner(System.in);
		Rectangle[] rectangle = new Rectangle[2];
        rectangle[0] = new Rectangle(4,40);
        rectangle[1] = new Rectangle(3.5, 35.9);
        int counter = 1;
        
        while(counter != 0) {
        	for (int i = 0; i < 2; i++){
        		try {
        			//Print the details of the rectangle
        			System.out.println("The details of rectangle " + (i+1) + ":");
        			System.out.println("Width of rectangle " + (i+1) + ":" + rectangle[i].getWidth());
        			System.out.println("Height of rectangle " + (i+1) + ":" + rectangle[i].getHeight());
        			System.out.println("Area of rectangle " + (i+1) + ":" + rectangle[i].getArea());
        			System.out.println("Perimeter of rectangle " + (i+1) + ":" + rectangle[i].getPerimeter() +"\n");
        		}
        		catch (Exception e) {
        			//Print the error message
        			System.out.println("Exception occured. Please try executing again."
        					+ "Error Message:" + e.getMessage());
        		}
    		}
    		//Prompt user input for another search
			System.out.print("\nEnter 0 to exit, any other integer to try again: ");
			counter = input.nextInt();
        }
        input.close();
	}
}