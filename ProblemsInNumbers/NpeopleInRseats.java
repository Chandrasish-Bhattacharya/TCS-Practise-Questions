
import java.util.Scanner;

// Permutations in which N people can occupy R seats
// Problem Statement: Find permutations in which n people can occupy r seats in a classroom.
// Input: N = 5, r = 3
// Output: 60
// Explanation: To find permutations of n people in r seats we have to find the value of n!/(n-r)!.The value of 5!/(5-3)! is 60.
// Input: N=6, r = 4.
// Output: 360 
// Explanation: The value of 6!/(6-4)! is 360.

public class NpeopleInRseats{
    public int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
    public int sol(int N , int r){
        return factorial(N) / factorial(N - r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().replaceAll("[\\[\\]{}()<>]", "");
        String[] parse = s.trim().split("[,\\s]+");
        int N = Integer.parseInt(parse[0]);
        int r = Integer.parseInt(parse[1]);
        NpeopleInRseats st = new NpeopleInRseats();
        System.out.println(st.sol(N,r));
    }
}