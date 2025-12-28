package ProblemsInArrays;
// Find the smallest element in an array
// Problem Statement: Given an array, we have to find the smallest element in the array.
// Example 1:
// Input:
//  arr[] = {2, 5, 1, 3, 0}  
// Output:
//  0  
// Explanation:
//   0 is the smallest element in the array.

import java.util.Arrays;

// Example 2:
// Input:
//  arr[] = {8, 10, 5, 7, 9}  
// Output:
//  5  
// Explanation:
//   5 is the smallest element in the array.
public class smallestElement {
    public static int smallestBruteForce(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public static int smallestOptimalSol(int[] arr){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ;i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }

     public static void main(String[] args) {
        // Initialize an array with elements
        int[] arr1 = {8, 10, 5, 7, 9};

        // Call the function to find the smallest element and output the result
        int min = smallestBruteForce(arr1);
        System.out.println("The smallest element in the array is: " + min);
    }
}
