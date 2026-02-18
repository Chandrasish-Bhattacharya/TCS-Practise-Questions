import java.util.Scanner;
public class PrimeNumbers{
    public static boolean bruteForce(int n){
        int cnt = 0;
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0) cnt++;
        }
        return cnt == 2;

    }

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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(checkPrime(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        sc.close();
    }
}