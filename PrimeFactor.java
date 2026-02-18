
import java.util.ArrayList;
import java.util.List;

public class PrimeFactor{
    public static boolean checkPrime(int n){
        int cnt = 0;

        for(int i = 1 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                cnt++;
                if(n / i != i){
                    cnt++;
                }
            }
        }
        return cnt == 2;
    }
    public static List<Integer> NormalSol(int n){
        List<Integer> m = new ArrayList<>();
        for(int i = 2 ; i <= n ; i++){
            if(n % i == 0 && checkPrime(i)){
                m.add(i);
            }
        }
        return m;
    }

    public static void main(String[] args){
        int n = 1500;

        System.out.println(NormalSol(n));
    }
}