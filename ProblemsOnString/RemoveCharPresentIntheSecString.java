import java.util.HashSet;
import java.util.Scanner;

public class RemoveCharPresentIntheSecString {
    public static String Solution(String s1 , String s2){
        String result = "";
        HashSet<Character> set = new HashSet<>();
        for(char ch : s2.toCharArray()){
            set.add(ch);
        }
        for(char ch : s1.toCharArray()){
            if(!set.contains(ch)){
                result+= ch;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.print(Solution(str1, str2));
        sc.close();

    }
}
