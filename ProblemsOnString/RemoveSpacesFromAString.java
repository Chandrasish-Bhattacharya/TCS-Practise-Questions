import java.util.Scanner;

public class RemoveSpacesFromAString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = s.replace(" ", "");
        System.out.print(result);
        sc.close();
    }
}