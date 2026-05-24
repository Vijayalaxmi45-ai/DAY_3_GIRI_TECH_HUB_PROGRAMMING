package day3;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String :");
		String s1 = scan.next();
		int vowel=0;
		int consonent = 0;
		for(int i=0; i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
			ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
			{
				vowel++;
			}
			else
			{
				consonent++;
			}
		}
		System.out.println("Vowel Characters : "+vowel);
		System.out.println("Consonent Characters : "+consonent);
	}

}
