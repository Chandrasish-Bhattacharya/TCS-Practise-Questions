
import java.util.Scanner;

// Find the sum of numbers in the given range
// Problem Statement: Find the sum of numbers in the given range.
// Example 1:
// Input:
//  l = 2, r = 7  
// Output:
//  27  
// Explanation:
//   The sum of numbers from 2 to 7 is: 2 + 3 + 4 + 5 + 6 + 7 = 27.  
// Therefore, the result is 27.

// Example 2:
// Input:
//  l = 5, r = 9  
// Output:
//  35  
// Explanation:
//   The sum of numbers from 5 to 9 is: 5 + 6 + 7 + 8 + 9 = 35.  
// Therefore, the result is 35.
public class SumOfRange{
    public static int solution1(int l , int r){
        int sum = 0;
        for(int i = l ; i <= r ; i++){
            sum += i; 
        }
        return sum;
    }
    public static int solution2(int l , int r){
        return (r * (r + 1)) / 2 - ((l - 1) * l) / 2;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine().replaceAll("[\\[\\]{}()<>]","");
    String[] parse = s.trim().split("[,\\s]+");
    int low = Integer.parseInt(parse[0]);
    int r = Integer.parseInt(parse[1]);
    System.out.println(solution2(low, r));
    }
}