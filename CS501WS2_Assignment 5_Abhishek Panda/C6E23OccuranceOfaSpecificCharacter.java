/**
 * Class: CS 501-WS2 Introduction to JAVA Programming <br />
 * Instructor: Prof. M Peter Jurkat <br />
 * Question: 6.23 <br />
 * Description: Welcome <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
   <br />
   Signed: Abhishek Panda <br />
   CWID: 10478486
 */

import static javax.swing.JOptionPane.showMessageDialog;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class C6E23OccuranceOfaSpecificCharacter {

	public static void main(String[] args) {
		
		System.out.println("This program allows the user to find the pccurance of chanracters entered by the user."
				+ "\nString must have at least eight characters.\r\n"
				+ "\nString must contain only letters and digits.\r\n"
				+ "\nString must contain at least two digits.");
		System.out.println("\nAfter the above conditions are passed then user is asked for the character to find occurance."
				+ "\nIf the user wants to run with the same word then enter yes or else new.");

			int counter=JOptionPane.YES_OPTION;
			while(counter==JOptionPane.YES_OPTION){
				try{
					String str=JOptionPane.showInputDialog(
							"Enter a String:\n Must be 8 or more" +
									"\n letters or numerical digits 2" +
							"\n of which must be digits");
					//Check validity of the string 
					isValidString(str);
					counter=JOptionPane.showConfirmDialog(null,
							"Valid String"+"\n\nDo you want to continue?");
					//Second loop
					int counter1=JOptionPane.YES_OPTION;
					while(counter1 ==JOptionPane.YES_OPTION) {
						try {
							String character;
							//Ask user to enter one character to search in the String
							while ((character = JOptionPane.showInputDialog("Enter a letter (only 1): ")).length() != 1);
							char single_char = character.charAt(0);
							//Printing the number of occurrence of character
							JOptionPane.showMessageDialog(null, "Total number of occurrences of  " + single_char + " is: " + count(str, single_char));
						}
						catch (Exception ex) {
							JOptionPane.showMessageDialog(null, "\nError:\n"+
						ex.getMessage());
						}
						counter1 =JOptionPane.showConfirmDialog(null,"\n Do you want to continue with same String?\n");
					}
				}// end try
				catch(Exception ex){
					String outputStr = " Invalid String: " + 
							ex.getMessage() +
							"\nDo you want to continue? ";
					counter = JOptionPane.showConfirmDialog(null, outputStr);
				} // end catch
			} // end while
	 }
	
	//To Count the number of characters
	 public static int count(String str, char a) {
		  int count = 0;
		 
		  for (int i = 0; i < str.length(); i++) {
		 
		   if (str.charAt(i) == a)
		    count++;
		 
		  }
		 
		  return count;
		 
		 }

	 //Check for the validity of string
	private static boolean isValidString(String str)throws Exception{
		   // enter code to check string requirements
				if (str.length() <8) {
					throw new Exception(" Must have at least 8 characters.\n"); 
				}
				else {
					char a;
					int count =0;
					for (int i =0; i<= str.length() -1 ; i++) {
						a= str.charAt(i);
						if (!Character.isLetterOrDigit(a)) {        
							throw new Exception(" Can ONLY contain alpha-numeric characters\n"); 
		                } 
						else if (Character.isDigit(a)) {
		                    count++;
						}
					}
		            if (count < 2)   {   
		            throw new Exception(" Must contain at least 2 digits.\n"); 
		                }
				}
				return true;

}
}
