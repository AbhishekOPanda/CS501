/**
 * Class: CS 501-WS2 Introduction to JAVA Programming <br />
 * Instructor: Prof. M Peter Jurkat <br />
 * Question: 1.5 <br />
 * Description: Compute expressions <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
   <br />
   Signed: Abhishek Panda <br />
   CWID: 10478486
 */

import static javax.swing.JOptionPane.showMessageDialog;

public class C1E5ComputeExpressions {

	public static void main(String[] args) {
		showMessageDialog(null, "We are calculating the solution of the following problem:\n((9.5*4.5)-(2.5*3))/(45.5-3.5)\n");
		double sol = ((9.5*4.5)-(2.5*3))/(45.5-3.5);
		System.out.println(sol);
		showMessageDialog(null, "Result:"+sol);
	}

}
