// package TCS-Practise-Questions.ProblemsOnString;

import java.util.Scanner;

public class VowelsConsonantsSpaces {
    public static int[] solution(String s){
        int cntSpace = 0, cntVowels = 0 , cntConsonants = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ' '){
                cntSpace++;
            }
            else{
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u'){
                    cntVowels++;
                }
                else if(s.charAt(i) > 'a' && s.charAt(i) < 'z'){
                    cntConsonants++;
                }
            }
        }
        return new int[]{cntSpace,cntVowels,cntConsonants};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int[] sol = solution(s);
        System.out.print("Spaces :" + sol[0]+ " Vowels :" + sol[1] + " Consonants :"+ sol[2]);
        sc.close();
    }
}
