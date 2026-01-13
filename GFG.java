import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int countSubstr(String s, int k) {
        //  code here
        int n = s.length() , count = 0;
        int distinct = 0 , left = 0;
        int[] freq = new int[256];
            Arrays.fill(freq , 0);
        for(int r = 0 ; r < n ; r++){
            if(freq[s.charAt(r)] == 0){
                distinct++;
                freq[s.charAt(r)] = 1;
            }

            while(distinct > k){
                freq[s.charAt(left)]--;
                if(freq[s.charAt(left)] == 0)
                    distinct--;

                left++;
            }
            if(distinct == k)
            count += 1;
        }
        return count;
    }
}

public class GFG {
    public static void main(String[] args) {
        String s = "abc";
        int k = 2;
        Solution sol = new Solution();
        int result = sol.countSubstr(s, k);
        System.out.println(result);
    }
}
