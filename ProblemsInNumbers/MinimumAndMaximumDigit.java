import java.util.Scanner;
public class MinimumAndMaximumDigit {

    public int[] solution(int n) {
        int l = Integer.MIN_VALUE, s = Integer.MAX_VALUE;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit > l) {
                l = lastDigit;
            } else if (lastDigit < s) {
                s = lastDigit;
            }
            n /= 10;
        }
        return new int[]{l, s};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MinimumAndMaximumDigit sol = new MinimumAndMaximumDigit();
        int[] s = sol.solution(n);
        System.out.println("Largest Number " + s[0] + " Smallest Number : " + s[1]);

    }
}
