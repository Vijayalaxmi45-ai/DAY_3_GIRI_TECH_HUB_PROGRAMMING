package day3;

import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String :");
		String s1 = scan.nextLine();
		String t = "";
		for(int i=s1.length()-1; i>=0; i--)
		{
			char ch = s1.charAt(i);
			t = t+ch;
		}
		if(s1.equals(t))
			System.out.println("string is palindrome");
		else
			System.out.println("string is not palindrome");
	}

}
