import java.util.Scanner;

public class NumberOfWords {
    public static int NumberOfWord(String s){ // using extra space thus increasing the space complexity
        String[] words = s.split(" ");
        return words.length;
    }
    public static int NumberOfword(String s){
        s.trim();
        int spaces = 0;
        for(char ch : s.toCharArray()){
            if(ch == ' '){
                spaces++;
            }
        }
        return spaces + 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(NumberOfword(s));
        sc.close();
    }
}
