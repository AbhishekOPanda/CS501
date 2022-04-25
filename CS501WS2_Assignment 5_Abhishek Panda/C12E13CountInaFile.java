/**
 * Class: CS 501-WS2 Introduction to JAVA Programming <br />
 * Instructor: Prof. M Peter Jurkat <br />
 * Question: 12.13 <br />
 * Description: Welcome <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
   <br />
   Signed: Abhishek Panda <br />
   CWID: 10478486
 */

import static javax.swing.JOptionPane.showMessageDialog;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

 
public class C12E13CountInaFile {

	//Counts the number of words
	public static int numOfWords(String str) {
			str = str.trim();
			if (str == null || str.isEmpty())
				return 0;
			String[] word = str.split(" ");
			return word.length;
		}

	//Counts the number of letters 
		public static int numOfLetters(String str) {
			char[] chars = str.toCharArray();
			int count = 0;
			for (int i = 0; i <= chars.length - 1; i++) {
				String s = String.valueOf(chars[i]);
				if (!s.matches("[^A-Za-z0-9 ]") && !s.matches(" ")) {
					count++;
				}
			}
			return count;
		}

		public static void main(String[] args) throws Exception {
			String Line;
			int answer = JOptionPane.YES_OPTION;
			try {

				//Program Description
				System.out.println("This program counts the number of words, lines, and letters of the file choosen from JFileChooser"
						+ "\nIt asks the user to run again after successful execution.");
				//calling the file chooser
				JFileChooser file = new JFileChooser();
				file.setFileFilter(new FileNameExtensionFilter(".txt file", "txt"));

				while (answer == JOptionPane.YES_OPTION) {
					int letters = 0;
					int words = 0;
					int lines = 0;
					int Chosen_file = file.showOpenDialog(null);
					if (Chosen_file != JFileChooser.APPROVE_OPTION) {
						throw new Exception("Invalid File Format !\n");
					} else {
						showMessageDialog(null, file.getSelectedFile().getName() + "\n");

						if (file.getSelectedFile() != null) {
							String fileName = file.getSelectedFile().getCanonicalPath();
							BufferedReader bf_reader = new BufferedReader(new FileReader(fileName));

							while ((Line = bf_reader.readLine()) != null) {
								lines++;

								words += numOfWords(Line);
								letters += numOfLetters(Line);
							}
						}
						showMessageDialog(null, "File name: " + file.getSelectedFile().getName()
						+ "\nNumber of Letters " + letters
						+ "\nNumber of Words " + words
						+ "\nNumber of Lines " + lines);
					}

					answer = JOptionPane.showConfirmDialog(null, "Do you want to continue ?",
							"Press 'Yes' to try another file.", JOptionPane.YES_NO_OPTION);
				}

			} catch (Exception e) { // starting the catch block

				answer = JOptionPane.showConfirmDialog(null,
						e.getMessage() + "- must have at least 8 characters\n - must contain only letters and digits\n"
								+ "\nDo you want to continue ?");
			}
	}

}
