
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PrimeFactors{
    public List<Integer> FindPrimeFator(int n){
        List<Integer> map = new ArrayList<>();
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                map.add(i);
                while(n % i == 0){
                    n /= i;
                }
            }
        }
        if(n>1){
            map.add(n);
        }
        return map;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    PrimeFactors sol = new PrimeFactors();
    System.out.println(sol.FindPrimeFator(s)); 
    }
}