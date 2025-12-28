// Reverse a given Array
// Problem Statement: You are given an array. The task is to reverse the array and print it.
// Input: N = 5, arr[] = {5,4,3,2,1}
// Output: {1,2,3,4,5}
// Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
// Input: N=6 arr[] = {10,20,30,40}
// Output: {40,30,20,10}
// Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
package ProblemsInArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    // Brute Force Approach
    public static int[] ReverseArrayBruteForce(int[] nums) {
        int[] Reversedarray = new int[nums.length];
        int j = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            Reversedarray[j++] = nums[i];
        }
        return Reversedarray;
    }

    // Better Solution
    public static int[] ReverseArrayBetterSol(int[] nums){
        int mid = nums.length / 2;
        for(int i = 0 ; i <= mid ; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length - (i + 1)];
            nums[nums.length - (i + 1)] = temp;
        }
        return nums;
    }

    // With Built-in Function 
    public static List<Integer> ReverseArrayBuildInfun(List<Integer> nums){ // it will work if this there is a list of integer
        Collections.reverse(nums);
        return nums;
    }
    public static void main(String[] args) {
        // Input array
        int[] arr = { 1, 2, 3, 4, 5 };
        List<Integer> arrList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.print("OG Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("OG LIST: ");
        for (Integer num : arrList) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Call the reverseArray function
        int[] result = ReverseArrayBetterSol(arr);
        List<Integer> sol = ReverseArrayBuildInfun(arrList);
        // Print the reversed array
        System.out.print("Reversed Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Reversed List: ");
        for (Integer num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
