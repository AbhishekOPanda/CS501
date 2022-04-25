/**
 * Class: CS 501-WS2 Introduction to JAVA Programming <br />
 * Instructor: Prof. M Peter Jurkat <br />
 * Question: 7.9, 7,10, 7.20 <br />
 * Description: Welcome <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
   <br />
   Signed: Abhishek Panda <br />
   CWID: 10478486
 */

import java.util.Scanner;
import java.util.Arrays;
import static javax.swing.JOptionPane.showMessageDialog;
public class C7E9_10_20 {

	
	// Returns the minimum value in the array
	public static double min(double[] array)
	{
		double min = array[0];
		for(double i: array)
			if(min > i) { min = i; }
		return min;
	}
	
	// Returns the index of the smallest element in the array
	public static int indexOfSmallestElement(double[] array)
	{
		int min = 0;
		for(int i = 1; i < array.length; i++)
			if(array[min] > array[i]) { min = i; }
		return min;
	}
	
	//Sorting the array by taking the largest element from the array and then replacing it with the last element.
    public static void sortingArray (double[] array){
        int index= array.length-1;
        for(int i = index; i >= 0; i--){
            int large = i;
            for(int j = index; j >= 0; j--){
                if(array[j] > array[large]){
                    large = j;
                }
            }
            if(large!=i){
                double temp= array[i];
                array[i]=array[large];
                array[large]= temp;
            }
            index--;
        }
    }
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] numbers = new double[10];	
		double[] sortedArray = new double[10];
		int repeat = 1;
		
		//Program Description
		System.out.println("This program allows the user to find the minimum element of an array, show it's index position and then sort the array");
		System.out.println("You can run the program until it 0 is entered");
		
		while(repeat != 0)
		{
			// Taking input from user
			System.out.print("\nEnter 10 decimal values: ");
			for(int i = 0; i < 10; i++) {
				numbers[i] = input.nextDouble();
				sortedArray[i] = numbers[i];
			}
			
			//Get minimum value from the array
			double min = min(numbers);
			//Get index of smallest element in the unsorted array
			int indexOfMin = indexOfSmallestElement(numbers);
			//Sorting the array
			sortingArray(sortedArray);
			//Display user input and output results
			showMessageDialog(null,"\nNumbers you entered:" 
					+ Arrays.toString(numbers)
					+ "\nThe minimum value is: "+ min
					+ "\nThe index in the array is: " + indexOfMin
					+ "\nSorted array is:\n"
					+ Arrays.toString(sortedArray));
			
			//Prompt user input for another search
			System.out.print("\nEnter 0 to exit, any other integer to try again: ");
			repeat = input.nextInt();
		}
		input.close();
	}
}
