import java.util.Scanner;

public class CharacterOfFrequency {
    public static void solution(String s){
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] != 0){
                System.out.print((char)(i + 'a') + " " + freq[i] + " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        solution(s);
        sc.close();
    }
}
