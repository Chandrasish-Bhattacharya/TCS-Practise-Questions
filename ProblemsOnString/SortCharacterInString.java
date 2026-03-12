import java.util.Arrays;
import java.util.Scanner;

public class SortCharacterInString {
    public static String sol(String s){
        char[] char_Array = s.toCharArray();
        Arrays.sort(char_Array);
        String ans = new String(char_Array);
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(sol(s));
        sc.close();
    }
}
