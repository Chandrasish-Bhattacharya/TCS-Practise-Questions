// package TCS-Practise-Questions.ProblemsOnString;

import java.util.Scanner;

public class ASCIIvalue {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        int s = (int)c.charAt(0);
        System.out.print(s);
        sc.close();
    }
}
