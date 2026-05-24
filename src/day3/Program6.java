/*
 * Write a Java program to find the length of a string.
	Example: "pune" → 4
 */
package day3;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String :");
		String s = scan.next();
		System.out.println("String Using Length Method :"+s.length());
		int count=0;
		for(int i=0; i<s.length(); i++)
		{	
			count++;
		}
		System.out.println("String length without method :"+count);
	}

}
