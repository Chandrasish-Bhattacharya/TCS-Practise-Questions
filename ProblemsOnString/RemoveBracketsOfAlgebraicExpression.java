import java.util.Scanner;

public class RemoveBracketsOfAlgebraicExpression {
    public static String sol(String s){
        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c != '(' && c != ')'){
                str.append(c);
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.print(sol(s));
        sc.close();
    }
}