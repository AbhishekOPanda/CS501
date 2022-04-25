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

import java.util.Scanner; //Include Scanner library

public class C_5_6_E_15_20_10_SmallestPrime {
	
	// Check whether number is prime
	public static boolean isPrime(int number) 
	{
		if(number == 1) { return false; }
		for (int divisor = 2; divisor <= number / 2; divisor++) 
		{
			if (number % divisor == 0)
				return false; 			// Number is not a prime
		}
		return true; // Number is prime
	}

	//Counts the number of prime number
	public static int countPrimes(int first, int last)
	{
		int count = 0;
		for(int i = first; i <= last; i++)
			if(isPrime(i)) { count++; } //Increment count when a prime is found
		return count;
	}
	
	//Storing the prime number in the array
	public static void storePrimes(int first, int last, int[] a)
	{
		int i = 0;
		while(first <= last && i < a.length)
		{
			if(isPrime(first))
				a[i++] = first; //Prime number is stored in current element and then i is incremented
			first++;
		}
	}
	
	
	//Display a given number of elements in an array
	public static void displayElements(int numElements, int[] a)
	{
		if (numElements > a.length) { numElements = a.length; } 		
		for(int i = 0; i < numElements; i++)
		{
			if(i%8 == 0) { System.out.print('\n'); } //New line every 8 elements
			System.out.print(a[i] + "\t");
		}
	}
	
	//Recursive function to display the prime factors of the given number
	public static void displayPrimeFactors(int number)
	{
		if(number == 1) return;
		for(int i = 2; i <= number; i++)
		{
			if(number % i == 0)
			{
				System.out.print(i + "\t");
				displayPrimeFactors(number/i);
				return;
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Program Description
		System.out.println("This program is demonstaration of three things:\n Smallest factor of a number in increasing order\n Prime numbers between 2 and 1000\n Prime numbers less than 10000.");
		System.out.println("You can run the program until you enter 0.");
		System.out.println("");
		
		int repeat = 1;							//Variable to check if user wants to go again
		int numPrimes = countPrimes(1,1000);
		int[] primes = new int[numPrimes];
		storePrimes(1,1000,primes);
		//Repeating the loop  until user entered 0
		while(repeat != 0)
		{
			//Prompt user input
			System.out.println("Enter the integer:");
			int number = input.nextInt();
			int counter = 0;
			for(int i=0; i<primes.length; i++) {
				if(number == primes[i]) {
					System.out.println("Congrats! "+ number +" is a prime number!");
					break;
				}
				counter++;
				if(counter==(primes.length-1))
				{
					System.out.println("Sorry, "+ number +" is NOT a prime number! Here are its prime factors:");
					displayPrimeFactors(number);
				}
			}
			//Prompt user input for another search
			System.out.print("\nEnter 0 to exit, any other integer to try again: ");
			repeat = input.nextInt();
		}
		input.close();
		System.out.println("\nFirst 50 Prime numbers between 2 and 1000\n");
		displayElements(50,primes);
		System.out.println("\nNumber of prime numbers less than 10000: " + countPrimes(1,10000));
	}
}