// package TCS-Practise-Questions.ProblemsOnNumberSystem;

import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int decimal = Integer.parseInt(s , 2);
        String sol = Integer.toOctalString(decimal);
        String Hex = Integer.toHexString(decimal);
        System.out.print(sol);
        sc.close();
    }
}
