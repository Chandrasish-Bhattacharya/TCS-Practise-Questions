
import java.util.Scanner;

// Sum Of Digits of A Number
// Problem Statement: Given an integer num, repeatedly add all its digits until the result has only one digit, and return i .
// Input: num = 529
// Output:7
// Explanation: In first iteration the digits sum will be = 5 + 2 + 9 => 16
// In second iteration the digits sum will be 1 + 6 => 7.
// Now single digit is remaining , so we return it. 

// Input:num = 101
// Output: 2
// Explanation: In first iteration the digits sum will be = 1 + 0 + 1 => 2
// Now single digit is remaining , so we return it. 
public class AddDigit{
    public static int solution1(int n){
        while(n >= 10){
            int sum = 0;
            while(n > 0){
                sum += n % 10;
                n /= 10; 
            }
            n = sum;
        }
        return n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution1(n));
    }
}