/*
 * Write a Java program to concatenate two strings.
	Using + operator
	Using concat() method
	Without using library function
 */
package day3;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String :");
		String s1 = scan.next();
		System.out.println("Enter second String :");
		String s2 = scan.next();
		String concat = s1+s2;
		System.out.println("String using + operator : "+concat);
		String t=s1;
		for(int i=0; i<s2.length();i++)
		{
			char ch = s2.charAt(i);
			t= t+ch;
		}
		System.out.println("String using without + operator : "+t);
		System.out.println("String using concat() method : "+s1.concat(s2));
	}

}
