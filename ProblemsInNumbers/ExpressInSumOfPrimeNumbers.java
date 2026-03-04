import java.util.Scanner;

public class ExpressInSumOfPrimeNumbers{
    public boolean isPrime(int n){
        if(n == 1) return false;
        for(int i = 2 ; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public boolean checkNumber(int n){
        for(int i = 2; i <= n/2; i++){
            if(isPrime(i) && isPrime(n - i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.parseInt(s);
        ExpressInSumOfPrimeNumbers sol = new ExpressInSumOfPrimeNumbers();
        if(sol.checkNumber(n)){
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
        sc.close();
    }
}