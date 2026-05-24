	/*
	 * Write a Java program to find transpose of a matrix.Enter matrix elements:
		1 2
		3 4Transpose Matrix:
		1 3
		2 4
	 */
	package day3;
	
	import java.util.Scanner;
	
	public class Program5 {
	
		public static void main(String[] args) {
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
	        
	        int Transpose[][] = new int[col][row];

	        for(int i=0; i<row; i++)
	        {
	            for(int j=0; j<col; j++)
	            {
	                Transpose[j][i]=arr[i][j];
	            }
	        }
	        System.out.println("Transpose Matrix :");
	        for(int i=0; i<Transpose.length; i++ )
	        {
	        	for(int j=0; j<Transpose[0].length; j++)
	        	{
	        		System.out.print(Transpose[i][j]+" ");
	        	}
	        	System.out.println();
	        }
		}
	
	}
