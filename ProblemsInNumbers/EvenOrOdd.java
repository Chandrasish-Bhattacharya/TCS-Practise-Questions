
import java.util.Scanner;

public class EvenOrOdd{
    public static boolean checkEvenNumber(int n){
        return n%2 == 0;
    }
    public static int checkEvenBybit(int n){
        return n & 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkEvenNumber(n));
        if(checkEvenBybit(n) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}