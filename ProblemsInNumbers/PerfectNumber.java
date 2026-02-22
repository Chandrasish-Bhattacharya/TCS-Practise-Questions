
import java.util.Scanner;

public class PerfectNumber{
    public static boolean findPerfectNumber(int n){
        int sum = 0;
        for(int i = 1 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                if(i * i == n || i == 1){
                    sum += i;
                }
                else sum += i + n / i;
            }
        }
        return sum == n;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
    int n = sc.nextInt();
    System.out.println(findPerfectNumber(n));
    }
}