// package TCS-Practise-Questions.ProblemsOnString;
import java.util.Scanner;
public class Pallindrone {
    public static boolean NormalSol(String s){
        int left = 0 , right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean MentosSol(int i , String s){
        if(i >= s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length() - i - 1)){
            return false;
        }
        return MentosSol(i+1,s);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sn = s.toLowerCase().replaceAll("[^0-9A-Za-z]", "");
        System.out.print(MentosSol(0,sn));
        sc.close();
    }
}
