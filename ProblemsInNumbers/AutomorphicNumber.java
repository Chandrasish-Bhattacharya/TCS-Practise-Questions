
import java.util.Scanner;

// Example 1:
// Input Format: N = 76
// Result: Automorphic Number
// Explanation: Calculating 76 * 76 gives 5776, it ends with the given number.
// Example 2:
// Input Format: 25
// Result: Automorphic Number
// Explanation: Calculating 25 * 25 gives 625, it ends with the given number.
public class AutomorphicNumber{
    public static boolean CheckAutomorphic(int n){
        int sqr = n * n;
        while(n > 0){
            if(n % 10 != sqr % 10){
                return false;
            }
            n /= 10;
            sqr /= 10;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(CheckAutomorphic(n));
    }
}