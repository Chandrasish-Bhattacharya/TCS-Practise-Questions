
import java.util.Arrays;

public class IncreasingDecreasingOrder {
    public static int[] bruteForce(int[] arr){
        
        Arrays.sort(arr);

        int n = arr.length;
        // Reverse the second half
        for (int i = n / 2, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int[] sol = bruteForce(arr);
        for(int i : sol){
            System.out.print(i + " ");
        }
    }
}