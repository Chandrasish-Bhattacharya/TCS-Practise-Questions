
import java.util.Scanner;

public class AbundantNumber{
    public boolean sol(int n){
        int sum = 0;
        for(int i = 1 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                
                if(n / i == i) {
                    sum += i;
                }
                else{
                    sum += i;
                    sum += n / i;
                }
            }
        }
        sum -= n;
        return sum > n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        AbundantNumber s = new AbundantNumber();
        System.out.println(s.sol(n));

    }
}