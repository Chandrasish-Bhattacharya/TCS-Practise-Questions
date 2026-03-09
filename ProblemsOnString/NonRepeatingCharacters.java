// Example 1:
// Input:
//  string = "google"  
// Output:
//  l,e  
// Explanation:
//   Non-repeating characters are l, e.

// Example 2:
// Input:
//  string = "yahoo"  
// Output:
//  y,a,h  
// Explanation:
//   Non-repeating characters are y, a, h.

import java.util.Scanner;

public class NonRepeatingCharacters {
    public static String solution(String s){
        String result = "";
        int[] freq = new int[256];
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ' '){
                continue;
            }
            freq[s.charAt(i)]++;
        }
        for(int i = 0 ; i < s.length() ; i++){
            if(freq[s.charAt(i)] == 1 && s.charAt(i) != ' '){
                result+= s.charAt(i) + " ";
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(solution(s));
        sc.close();
    }
}
