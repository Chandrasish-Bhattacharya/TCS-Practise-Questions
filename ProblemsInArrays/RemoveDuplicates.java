import java.util.HashSet;

public class RemoveDuplicates {
    public static int bruteForce(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        int idx = 0;
        for(int i : arr){
            if(!set.contains(i)){
                set.add(i);

                arr[idx++] = i;
            }
        }
        return idx;
    }

    public static int bestSol(int[] arr){
        if(arr.length == 0) return 0;

        int i = 0;
        for(int j = 1 ; j < arr.length ; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

     public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int k = bestSol(nums);

        System.out.println("k = " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
