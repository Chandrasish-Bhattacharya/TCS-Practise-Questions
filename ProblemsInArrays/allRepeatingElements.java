// Find all repeating elements in an array
// Problem Statement: Find all the repeating elements present in an array.
// Example 1:

// Input:
// Arr[] = [1,1,2,3,4,4,5,2]

// Output:
//  1,2,4
// Explanation:
//  1,2 and 4 are the elements which are occurring more than once.
// Example 2:

// Input:
//  Arr[] = [1,1,0]

// Output:
//  1
// Explanation:
//  Only 1 is occurring more than once in the given array.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class allRepeatingElements {
    public static void bruteForce(int[] arr) {
        int n = arr.length;
        int[] temp = new int[100];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    temp[cnt++] = arr[i];
                }
            }
        }

        System.out.println("All repeating elements in an array");

        for (int i = 0; i < cnt; i++) {
            System.out.println(temp[i]);
        }
    }

    public static void better(int[] arr){
        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i] == arr[i + 1]){
                System.out.println(arr[i]);
            }
        }
    }

    public static void bestSol(int[] arr){
        Map<Integer , Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i , map.getOrDefault(i , 0) + 1);
        }

        System.out.print("The repeating elements are: ");
        // Print the elements that appear more than once
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1,1,2,3,4,4,5,2}; // Example input
        bestSol(arr); // Call function to find repeating element
    }
}