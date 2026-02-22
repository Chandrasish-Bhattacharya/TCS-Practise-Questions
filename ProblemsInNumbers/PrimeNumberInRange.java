import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PrimeNumberInRange{
    public boolean checkPrime(int n){
        if(n == 1) return false;
        for(int i = 2; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public List<Integer> solution(int start , int end){
        List<Integer> Primes = new ArrayList<>();
        
        for(int i = start ; i <=end ; i++){
            if(checkPrime(i)){
                Primes.add(i);
            }
        }
        return Primes;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().replaceAll("[\\[\\]{}()<>]", "");
        String[] parse = s.trim().split("[,\\s]+");
        int start = Integer.parseInt(parse[0]);
        int end = Integer.parseInt(parse[1]);
        PrimeNumberInRange sol = new PrimeNumberInRange();
        System.out.println(sol.solution(start, end));
        
    }
}