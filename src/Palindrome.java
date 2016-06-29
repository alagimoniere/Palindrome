/* Palindrome.java
 * Author: Alyssa Lagimoniere
 * Submission Date: 2/20/15
 * 
 * Purpose: To determine if a valid user-inputed integer is a
 * palidrome or not, and if so, the summation of the integer.
 * 
 * Statement of Academic Honesty: 
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with 
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia. 
 */

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	
		//Get user input
		System.out.print("Please enter an integer > 0: ");
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int original = n;
		
		//Determine validity
		if (n <= 0) {
			System.out.println("Sorry, you must enter an integer greater than zero.");
			System.exit(0);
		}
		
		//Determine if it is a palindrome
		int reverse = 0;
		int remainder;
		while (n > 0) {
			remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n /= 10;
			//System.out.print(remainder);
		}
		//System.out.println(reverse);
		//System.out.println(original);
		if (original == reverse) {
			System.out.println("The integer " + original + " is a palindrome.");
		}
		else {
			System.out.println("The integer " + original + " is not a palindrome.");
			System.exit(0);
			
		}
		
		//Summation
		int sum = 0;
		int count = 0;
		while (count <= original) {
			sum += count++;
		}
		System.out.print("The sum of the numbers from 1 to " + original + " is " + sum);
	}
		
}
