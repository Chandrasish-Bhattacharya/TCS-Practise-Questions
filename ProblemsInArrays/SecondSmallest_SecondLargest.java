package ProblemsInArrays;
// Find Second Smallest and Second Largest Element in an array

// Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

// Example 1:
// Input:
//  [1, 2, 4, 7, 7, 5]  
// Output:
// Second Smallest : 2  
// Second Largest : 5  
// Explanation:
//   The elements are sorted as 1, 2, 4, 5, 7, 7.  
// Hence, the second smallest element is 2, and the second largest element is 5

// Example 2:
// Input:
//  [1]  
// Output:
// Second Smallest : -1  
// Second Largest : -1  
// Explanation:
//   Since there is only one element in the array, it is both the largest and smallest element.  
// Therefore, there is no second smallest or second largest element present.
import java.util.Arrays;

public class SecondSmallest_SecondLargest {

    public static int[] SecondSmallest_SecondLargestBruteForce(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1)
            return new int[] { -1, -1 };

        Arrays.sort(arr);

        return new int[] { arr[1], arr[arr.length - 2] };
    }

    public static int[] SecondSmallest_SecondLargestOptimal(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1)
            return new int[] { -1, -1 };

        int largest = Integer.MIN_VALUE;
        int SecondLargests = Integer.MAX_VALUE;

        int smallest = Integer.MAX_VALUE;
        int SecondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (smallest > arr[i]) {
                SecondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < SecondSmallest && arr[i] != smallest) {
                SecondSmallest = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (largest < arr[i]) {
                SecondLargests = largest;
                largest = arr[i];
            } else if (arr[i] > SecondLargests && arr[i] != largest) {
                SecondLargests = arr[i];
            }
        }
        return new int[] { SecondSmallest, SecondLargests };
    }

    public static void main(String[] args) {

        // Initialize the array with elements
        int[] arr = { 1, 2, 4, 6, 7, 5 };

        // Call the method to find and print the second smallest and second largest
        // elements
        int[] sol = SecondSmallest_SecondLargestOptimal(arr);
        System.out.println("SecondSmallest " + sol[0] + " SecondLargests  " + sol[1]);
    }
}
