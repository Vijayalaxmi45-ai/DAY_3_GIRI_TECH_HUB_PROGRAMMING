/*
 * Write a Java program to copy one string into another string.
	Using assignment operator
	By copying each character manually
 */
package day3;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String :");
		String s = scan.next();
		String copy = s;
		System.out.print("String Copy : "+copy);
	}

}
