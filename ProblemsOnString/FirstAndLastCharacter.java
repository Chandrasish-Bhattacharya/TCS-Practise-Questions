import java.util.Scanner;

public class FirstAndLastCharacter {
    public static String FirstAndLast(String s){
        char[] arr = s.toCharArray();
        int n = arr.length;
        int start = 0;
        while(start < n){
            while(start < n && arr[start] == ' '){
                start++;
            }
            if(start >= n){
                break;
            }
            int end = start;
            while(end < n && arr[end] != ' '){
                end++;
            }
            if(Character.isLowerCase(arr[start])){
                arr[start] = Character.toUpperCase(arr[start]);
            }
            if(end - 1 > start && Character.isLowerCase(arr[end - 1])){
                arr[end - 1] = Character.toUpperCase(arr[end - 1]);
            }
            start = end;
        }
        return new String(arr);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.print(FirstAndLast(s));
        sc.close();
    }
}
