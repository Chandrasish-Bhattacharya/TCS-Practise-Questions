import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumOccurringCharacter {
    public static Character MaxOccurence(String s){
        HashMap<Character , Integer> map = new HashMap<>();
        for(char a : s.toCharArray()){
            map.put(a, map.getOrDefault(a,0) + 1);
        }
        int maxFreq = 0;
        char maxChar = '\0';
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        return maxChar;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(MaxOccurence(s));
        sc.close();
    }
}
