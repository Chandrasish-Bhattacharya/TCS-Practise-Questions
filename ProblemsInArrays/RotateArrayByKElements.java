// Input : N = 5, array[] = {1, 2, 3, 4, 5}, K = 2
// Output (Left Rotation) : {3, 4, 5, 1, 2}
// Explanation : After rotating left by 2, the first two elements move to the end.

// Input : N = 5, array[] = {1, 2, 3, 4, 5}, K = 2
// Output (Right Rotation) : {4, 5, 1, 2, 3}
// Explanation : After rotating right by 2, the last two elements move to the start.
// package ProblemsInArrays;

public class RotateArrayByKElements {

    public static void Reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void Right(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        if (k == 0) return;

        Reverse(arr, 0, n - 1);
        Reverse(arr, 0, k - 1);
        Reverse(arr, k, n - 1);
    }

    public static void Left(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        if (k == 0) return;

        Reverse(arr, 0, k - 1);
        Reverse(arr, k, n - 1);
        Reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        Right(arr, k);
        System.out.print("Right Rotation: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        arr = new int[]{1, 2, 3, 4, 5};
        Left(arr, k);
        System.out.print("Left Rotation: ");
        for (int num : arr) System.out.print(num + " ");
    }
}
