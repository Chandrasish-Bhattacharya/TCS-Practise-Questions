
import java.util.Scanner;

public class HarshadNumber{
    public int Harshad(int n){
        int sum = 0 , dublicate = n;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return dublicate % sum  == 0 ? sum : -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HarshadNumber sol = new HarshadNumber();
        System.out.println(sol.Harshad(n));
    }
}