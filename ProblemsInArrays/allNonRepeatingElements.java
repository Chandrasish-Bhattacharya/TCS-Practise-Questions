// Find all the non-repeating elements in an array
// Problem Statement: Find all the non-repeating elements for a given array. Outputs can be in any order.

// Example 1:
// Input:
//  Nums = [1,2,-1,1,3,1]

// Output:
//  2,-1,3
// Explanation:
//  1 is the only element in the given array which occurs thrice in the array. -1,2,3 occurs only once and hence, these are non-repeating elements of the given array.

// Example 2:
// Input:
//  Nums = [1,2,3]

// Output:
//  1,2,3
// Explanation:
//  All elements present in the array occur once. Hence, every element is non-repeating.

import java.util.HashMap;
import java.util.Map;

public class allNonRepeatingElements{
    public static void bestSol(int[] nums){
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> ele : map.entrySet()){
            if(ele.getValue() == 1){
                System.out.println(ele.getKey() + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, -1, 1, 3, 1};  // Example input
        bestSol(nums);  // Call function to find non-repeating elements
    }
}