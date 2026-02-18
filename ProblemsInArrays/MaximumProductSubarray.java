// Maximum Product Subarray in an Array
// Problem Statement: Given an array that contains both negative and positive integers, find the maximum product subarray.
// Input: Nums = [1,2,3,4,5,0]
// Output: 120
// Explanation: 
// In the given array, 1×2×3×4×5 gives maximum product value.
// Input: Nums = [1,2,-3,0,-4,-5]
// Output: 20
// Explanation: 
// In the given array, (-4)×(-5) gives maximum product value.
public class MaximumProductSubarray{
    public static int bruteForce(int[] arr){
        int maxProduct = 0;
        for(int i = 0 ; i< arr.length ; i++){
            int prod = 1;
            for(int j = i ; j < arr.length ; j++){
                prod *= arr[j];

                maxProduct = Math.max(maxProduct, prod);
            }
        }
        return maxProduct;
    }

    public static int optimalSol(int[] arr){
        int preFixSum = 1 , suffixSum = 0;
        int ans = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(preFixSum == 0) preFixSum = 1;
            if(suffixSum == 0) suffixSum = 1;

            preFixSum *= arr[i];
            suffixSum *= arr[arr.length - i - 1];

            ans = Math.max(ans , Math.max(preFixSum, suffixSum));
        }
        return ans;
    }
    
    public static void main(String[] args) {
         // Sample input
        int[] nums = {2, 3, -2, 4};

        // Print the result
        System.out.println(optimalSol(nums));
    }
}