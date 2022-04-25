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

public class C9E1RectangleClass {
		public static void main(String[] args) {
			
			//Program Description
			System.out.println("This program allows the user to print the width, height, area and perimeter of a rectangle.");
			System.out.println("This program checks for execption using try and catch block. It checks if width and height are not negative.");
			System.out.println("User can run the program until 0 is entered");

			Scanner input = new Scanner(System.in);
	        int counter = 1;
	        Rectangle rectangle = new Rectangle();
	        
	        while(counter != 0) {
	        	//Taking input from the user
				System.out.print("\nEnter the width: ");
				double width = input.nextDouble();
				System.out.print("Enter the height: ");
				double height = input.nextDouble();
				
	        	try {
	        		//Creating object with user input
	        		rectangle = new Rectangle(width,height);
	        		//Printing the values
	        		System.out.println("The details of rectangle : ");
	        		System.out.println("Width of rectangle : " + rectangle.getWidth());
	        		System.out.println("Height of rectangle : " + rectangle.getHeight());
	        		System.out.println("Area of rectangle : " + rectangle.getArea());
	        		System.out.println("Perimeter of rectangle : " + rectangle.getPerimeter() +"\n");
	        			
	            	//Prompt user input for another search
	        		System.out.print("\nEnter 0 to exit, any other integer to try again: ");
	        		counter = input.nextInt();
	        	}
	        	catch (Exception e) {
	        		System.out.println("Exception occured. Please try executing again.\n"
	        				+ "Error Message : " + e.getMessage());
	        	}
	    	}
        input.close();
	}
}