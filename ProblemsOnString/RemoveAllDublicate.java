import java.util.Scanner;

public class RemoveAllDublicate {
    public static String RemoveAllDublicateS(String s){
        boolean[] seen = new boolean[26];
        String result = "";
        for(char c : s.toCharArray()){
            if(!seen[c - 'a']){
                seen[c - 'a'] = true;
                result+= c;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(RemoveAllDublicateS(s));
        sc.close();
    }
}
