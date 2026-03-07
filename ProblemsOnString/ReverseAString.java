import java.util.Scanner;

public class ReverseAString {
    public String ReverseString(String s){
        char[] arr = s.toCharArray();
        int left = 0 , right = s.length() - 1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return new String(arr);
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine().trim();
    ReverseAString sol = new ReverseAString();
    System.out.print(sol.ReverseString(s));
    sc.close();
    }
}
