import java.util.Scanner;

public class LargestWord {
    public static String LongestWord(String s){
        String[] sol = s.split(" ");
        int LargestLength = sol[0].length();
        String LargestWord = sol[0];
        for(String st : sol){
            if(LargestLength < st.length()){
                LargestWord = st;
                LargestLength = st.length();
            }
        }
        return LargestWord;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(LongestWord(s));
        sc.close();
    }
}
