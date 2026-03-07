import java.util.Scanner;

public class RemoveStringExceptAlphabets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().replaceAll("[^A-Za-z]", "");
        System.out.print(s);
        sc.close();
    }
}
