/*
 * Write a Java program to compare two strings.
	Using equals()
	Using ==
	Using equalsIgnoreCase()
	Without using library function
 */
package day3;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String :");
		String s1 = scan.next();
		System.out.println("Enter second String :");
		String s2 = scan.next();
		
		System.out.println("String using euqals() method :"+s1.equals(s2));
		System.out.println("String using == operator : "+(s1==s2));
		System.out.println("String using euqals()  method : "+s1.equalsIgnoreCase(s2));
		
		int flag = 1; 
		if(s1.length()!=s2.length())
		{
			flag=0;
		}
		else
		{
			for(int i=0; i<s1.length(); i++)
            {
                if(s1.charAt(i)!=s2.charAt(i))
                {
                    flag = 0;
                    break;
                }
            }
		}
		if(flag==1)
		{
			System.out.println("String without using method : "+true);
		}
	}

}
