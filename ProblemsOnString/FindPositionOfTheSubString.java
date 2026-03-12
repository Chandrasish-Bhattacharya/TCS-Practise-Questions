import java.util.Scanner;

public class FindPositionOfTheSubString {
    public static int Positon(String s, String subString){
        return s.indexOf(subString);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String Sub_str = sc.nextLine();
        System.out.print(Positon(str,Sub_str));
        sc.close();
    }
}
