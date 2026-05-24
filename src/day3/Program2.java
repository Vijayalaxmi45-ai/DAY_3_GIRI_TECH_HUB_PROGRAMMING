/*
 * Merge Two Arrays
	Write a program to merge two arrays into a single array.
	Example: Array1: [1, 2, 3] Array2: [4, 5, 6] Output: [1, 2, 3, 4, 5, 6]
 */
package day3;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st array size :");
		int n1 = scan.nextInt();
		int[] arr1 = new int[n1];
		System.out.println("Enter array elemnts :");
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i] = scan.nextInt();
		}
		
		System.out.println("Enter 1st array size :");
		int n2 = scan.nextInt();
		int[] arr2 = new int[n2];
		System.out.println("Enter array elemnts :");
		for(int i=0; i<arr2.length; i++)
		{
			arr2[i] = scan.nextInt();
		}
		
		int merge[] = new int[arr1.length+arr2.length];
		for(int i=0; i<arr1.length; i++)
		{
			merge[i]=arr1[i];
		}
		for(int i=0; i<arr2.length; i++)
		{
			merge[arr1.length+i]=arr2[i];
		}
		
		System.out.println("Merged Array");
		for(int i=0; i<merge.length; i++)
		{
			System.out.print(merge[i]+" ");
		}
	}

}
