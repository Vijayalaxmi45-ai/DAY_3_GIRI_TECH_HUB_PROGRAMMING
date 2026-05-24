package day3;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String :");
		String s1 = scan.next();
		
		String t = "";
		for(int i=0; i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			if(ch>=65 && ch<=90)
			{
				t = t+(char)(ch+32);
			}
			else if(ch>=97 && ch<=122)
			{
				t = t+(char)(ch-32);
			}
		}
		System.out.println(t);
	}

}
