import java.util.Scanner;

public class ReverseWords{
    public static String ReverseWord(String s){
        String[] arr = s.trim().split("\\s+");
        int left = 0 , right = arr.length - 1;
        while(left<right){
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }   
        return String.join(" ", arr).trim();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(ReverseWord(s));
        sc.close();
    }
}