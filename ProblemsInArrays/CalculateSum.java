package ProblemsInArrays;

public class CalculateSum {
    public static int Sol(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Sol(arr));
    }
}
