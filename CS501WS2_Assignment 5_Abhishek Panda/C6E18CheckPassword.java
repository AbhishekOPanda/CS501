/**
 * Class: CS 501-WS2 Introduction to JAVA Programming <br />
 * Instructor: Prof. M Peter Jurkat <br />
 * Question: 6.18 <br />
 * Description: Compute expressions <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
   <br />
   Signed: Abhishek Panda <br />
   CWID: 10478486
 */

import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class C6E18CheckPassword {
	public static void main(String[] args){
		
		//Program Description
				System.out.println("This program allows the user to Whether a password is valid or not."
						+ "\nString must have at least eight characters.\r\n"
						+ "\nString must contain only letters and digits.\r\n"
						+ "\nString must contain at least two digits.");
				System.out.println("\nExpection is raised when an error is encountered");

				
		int option=JOptionPane.YES_OPTION;
		while(option==JOptionPane.YES_OPTION){
			try{
				String password=JOptionPane.showInputDialog(
						"Enter a Password: Must be 8 or more" +
								" letters or numerical digits 2" +
						" of which must be digits");
				//Checking for validity of password
				isValidPassword(password);
				option=JOptionPane.showConfirmDialog(null,
						"Valid Password"+"\nDo you want to continue");
			} // end try
			catch(Exception ex){
				String outputStr = " Invalid Password: " + 
						ex.getMessage() + 
						"\nDo you want to continue? ";
				option = JOptionPane.showConfirmDialog(null, outputStr);
			} // end catch
		} // end while
	} // end main()
	private static boolean isValidPassword(String str)throws Exception{
   // enter code to check password requirements
		if (str.length() <8) {
			throw new Exception(" (1) Must have at least 8 characters.\n"); 
		}
		else {
			char a;
			int count =0;
			for (int i =0; i<= str.length() -1 ; i++) {
				a= str.charAt(i);
				if (!Character.isLetterOrDigit(a)) {        
					throw new Exception(" (2) Can ONLY contain alpha-numeric characters\n"); 
                } 
				else if (Character.isDigit(a)) {
                    count++;
				}
			}
            if (count < 2)   {   
            throw new Exception(" (3) Must contain at least 2 digits.\n"); 
                }
		}
		return true;
   }// end isValidPassword
} // end class PasswordBlank