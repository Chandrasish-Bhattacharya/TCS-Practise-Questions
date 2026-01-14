// Find all Symmetric Pairs in the array of pairs

// Problem Statement: Given an array of pairs, find all the symmetric pairs in the array.

// Example 1:
// Input:
// (1,2),(2,1),(3,4),(4,5),(5,4)

// Output:
// (2,1) (5,4)
// Explanation:
//  Since (1,2) and (2,1) are symmetric pairs and (4,5) and (5,4) are symmetric pairs.

// Example 2:
// Input:
//  (1,5),(2,3),(4,2),(5,1),(2,4)

// Output:
//  (2,4) (5,1)
// Explanation:
//  Since (1,5) and (2,4) are symmetric pairs and (5,1) and (4,2) are symmetric pairs.

import java.util.ArrayList;
import java.util.List;

public class SymmetricPairs{
    public static int[][] bruteForce(int[][] arr){
        List<int[]> result = new ArrayList<>();

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]){
                    result.add(arr[i]);
                }
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    public static void print2dArray(int[][] arr){
        for(int[] a : arr){
            System.out.println(a[0] + "," + a[1]);
        }
    }
    public static void main(String[] args) {

        int[][] arr = {{5, 8}, {7, 9}, {8, 5}, {9, 7}, {6, 10}};

        int[][] result = bruteForce(arr);

        print2dArray(result);
}
}