/**
 * Class: CS 501-WS2 Introduction to JAVA Programming <br />
 * Instructor: Prof. M Peter Jurkat <br />
 * Question: 9.5 <br />
 * Description: Welcome <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
   <br />
   Signed: Abhishek Panda <br />
   CWID: 10478486
 */

import java.util.GregorianCalendar;

public class C9E5GregorianCalendar {

	public static void main(String[] args) {
		
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		final long TIME = 1234567898765L;
		
		//Initialize to current date
		GregorianCalendar date = new GregorianCalendar();	
		
		//Program Description
		System.out.println("The program shows you the current date with the help of GregorianCalender class.");
		System.out.println("It shows the date after an elapsed time of 1234567898765 milliseconds from Jan 1, 1970\n");
		
		//Display current date
		System.out.println("Today's Date:");
		System.out.println("Year: " + date.get(GregorianCalendar.YEAR));
		System.out.println("Month: " + months[date.get(GregorianCalendar.MONTH)]);
		System.out.println("Day: " + date.get(GregorianCalendar.DAY_OF_MONTH));
		
		//Set time to 1234567898765 milliseconds from Jan 1, 1970
		date.setTimeInMillis(TIME);
		
		//Display new date from elapsed time
		System.out.println("\nDate 1234567898765 milliseconds after 1/1/1970:");
		System.out.println("Year: " + date.get(GregorianCalendar.YEAR));
		System.out.println("Month: " + months[date.get(GregorianCalendar.MONTH)]);
		System.out.println("Day: " + date.get(GregorianCalendar.DAY_OF_MONTH));	
	}
}
