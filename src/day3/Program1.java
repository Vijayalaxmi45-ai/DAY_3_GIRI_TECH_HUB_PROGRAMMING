package day3;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elemnts :");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Duplicate Elements are :");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}

}
