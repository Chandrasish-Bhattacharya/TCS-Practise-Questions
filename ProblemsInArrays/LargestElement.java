package ProblemsInArrays;
// Find the Largest element in an array
// Problem Statement: Given an array, we have to find the largest element in the array.
// Example 1:
// Input:
//  arr[] = {2, 5, 1, 3, 0}  
// Output:
//  5  
// Explanation:
// 5 is the largest element in the array.
// Example 2:
// Input:
//  arr[] = {8, 10, 5, 7, 9}  
// Output:
//  10  
// Explanation:
// 10 is the largest element in the array.
import java.util.Arrays;
public class LargestElement {
    public static int LargestBruteForce(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    public static int LargestOptimalSol(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }
     public static void main(String[] args) {
        // Initialize an array with elements
        int[] arr1 = {8, 10, 5, 7, 9};

        // Call the function to find the smallest element and output the result
        int max = LargestOptimalSol(arr1);
        System.out.println("The smallest element in the array is: " + max);
    }
}
