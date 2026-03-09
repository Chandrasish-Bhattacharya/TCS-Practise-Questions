import java.util.Scanner;

public class DigitSumGFG {
    public static int Solution(String s) {
        String currNum = "";
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                currNum += ch; // build number
            } else {
                if (!currNum.isEmpty()) {
                    sum += Integer.parseInt(currNum);
                    currNum = "";
                }
            }
        }

        // add last number if string ends with digits
        if (!currNum.isEmpty()) {
            sum += Integer.parseInt(currNum);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.print(Solution(s));
        sc.close();
    }
}