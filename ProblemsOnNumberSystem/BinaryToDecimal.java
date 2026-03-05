// package TCS-Practise-Questions.ProblemsOnNumberSystem;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int decimal = Integer.parseInt(s , 2);
        System.out.print(decimal);
        sc.close();
    }
}
