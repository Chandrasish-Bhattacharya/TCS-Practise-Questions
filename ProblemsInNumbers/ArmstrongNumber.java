
import java.util.Scanner;

public class ArmstrongNumber{
    public static boolean Armstrong(int n){
    int d = 0;
    int match = n;
    while(n != 0){
    int last = n % 10;
    d += last*last*last;
    n /= 10;
    }
    return match == d;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(Armstrong(n));
    }
}