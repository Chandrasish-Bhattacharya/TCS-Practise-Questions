// Rearrange array in increasing-decreasing order
// Problem Statement: Rearrange a given array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order
// Input: [8 7 1 6 5 9]
// Output: [1 5 6 9 8 7]
// Explanation: First three elements are in the ascending order and next three elements are in the descending order.
// Input: [4 2 8 6 15 5 9 20]
// Output: [2 4 5 6 20 15 9 8]
// Explanation: First four elements are in the ascending order and next four elements are in the descending order.
package ProblemsInArrays;

import java.util.Arrays;

public class RearrangeArrayinIncreasingDecreasingOrder {
    public static void sol(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = n / 2, j = n - 1; i < j; i++, j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 6, 3 };

        for (int x : arr) {
            System.out.print(x + " ");
        }

        sol(arr);
        System.out.println("");
        // Print rearranged array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
