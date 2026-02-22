
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CheckIfSubsetOfAnotherArray {
    public static boolean binarySearch(List<Integer> s , int ele){
        int left = 0 , right = s.size();
        while(left <= right){
            int mid = (right + left) / 2;
            if(s.get(mid) == ele) return true;
            else if(s.get(mid) < ele) {
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return false;
    }
    public static boolean isSubset(List<Integer> f, List<Integer> s) {
        Collections.sort(s);
        if(f.size() > s.size()) return false;
        boolean check = false;
        for (int i = 0 ; i < f.size() ; i++){
            check = binarySearch(s, f.get(i));
            if(!check) return false; 
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstArray = sc.nextLine().replaceAll("[\\[\\]<>{}()]", "");// first Array 
        String secArray = sc.nextLine().replaceAll("[\\[\\]<>{}()]", "");// sec Array 
        String[] first = firstArray.trim().split("[,\\s]+");
        String[] sec = secArray.trim().split("[,\\s]+");
        List<Integer> f = new ArrayList<>();
        List<Integer> s = new ArrayList<>();
        for (String str : first) {
            f.add(Integer.parseInt(str));
        }
        for (String i : sec) {
            s.add(Integer.parseInt(i));
        }
        System.out.print(isSubset(f, s));
    }
}
