/*
 * Check Array is Palindrome or Not
 * Input:
 * 1 2 3 2 1
 * Output:
 * Palindrome Array
 */

package day3;

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");

        for(int i=0;i<arr.length; i++) 
        {
            arr[i] = scan.nextInt();
        }

        int[] copy = arr.clone();
        int start = 0;
        int end = arr.length-1;

        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        boolean flag = true;
        for(int i=0; i<arr.length;i++) 
        {
            if(copy[i]!=arr[i]) 
            {
                flag = false;
                break;
            }
        }

        if(flag) 
        {
            System.out.println("Palindrome Array!!!");
        }
        else 
        {
            System.out.println("Not Palindrome Array!!!");
        }
    }
}