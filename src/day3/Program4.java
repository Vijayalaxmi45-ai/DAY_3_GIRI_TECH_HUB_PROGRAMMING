package day3;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter array row size:");
        int row = scan.nextInt();
        
        System.out.println("Enter array column elements:");
        int col = scan.nextInt();
        int[][] arr = new int[row][col];
        
        System.out.println("Enter array  elements:");
        for(int i=0;i<arr.length; i++) 
        {
           for(int j=0; j<arr[0].length; j++)
           {
        	   arr[i][j]=scan.nextInt();
           }
        }
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
        	for(int j=0; j<arr[0].length; j++)
        	{
        		sum=sum+arr[i][j];
        	}
        }
        System.out.println("Sum : "+sum);
	}

}
