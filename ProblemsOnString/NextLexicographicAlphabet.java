import java.util.Scanner;

public class NextLexicographicAlphabet {
    public static String Solution(String s){
        String result = "";
        for(char ch : s.toCharArray()){
            result += (char)((ch - 'a' + 1) % 26 + 'a'); 
        }
        return result;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.print(Solution(s));
    sc.close();
    }
}
