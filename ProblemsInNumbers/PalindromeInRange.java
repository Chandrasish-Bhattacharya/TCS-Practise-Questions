
import java.util.ArrayList;
import java.util.List;

public class PalindromeInRange{
    public static boolean CheckPallindrome(int n){
        int reverseNum = 0;
        int dub = n;
        while(n>0){
            int lastDigit = n % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            n /= 10;
        }
        return reverseNum == dub;
    }

    public static List<Integer> Solution(int lb , int hb){
        List<Integer> list = new ArrayList<>();
        for(int i = lb ; i <= hb ; i++){
            if(CheckPallindrome(i))list.add(i);
        }
        return list;
    }
    public static void main(String[] args){
        int lowerBound = 100 , highBound = 150;
        List<Integer> list = Solution(lowerBound, highBound);
        System.out.println(list);
    }
}