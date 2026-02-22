// Examples 1:
// Input:
//  N = 145
// Output
// : Yes
// Explanation:
//  1! + 4! + 5! = 145. Hence 145 is a strong number. 

// Example 2:
// Input:
//   26
// Output:
//  No
// Explanation:
//  2! + 6! = 722. Hence 26 is not a strong number.
import java.util.Scanner;

public class StrongNumber {

    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public boolean SN(int n) {
        int d = n , sum = 0;
        
        while (n > 0) {
            sum += factorial(n % 10);
            n /= 10;
        }
        return d == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StrongNumber number = new StrongNumber();
        System.out.println(number.SN(n));
    }
}
