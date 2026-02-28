
import java.util.Scanner;
// x = [-b ± √(b² - 4ac)] / (2a) Formula to use 
// Program to Find Roots of a quadratic equation

// Problem Statement: The standard form of a quadratic equation is: ax^2 + bx + c = 0, where a, b and c are real numbers and a != 0. Given a, b and c of the equation, find the roots of the equation.
// Input: a = 1, b = -3, c = -10
// Output: Roots are real and different, i.e (5 , -2). 
// Explanation: 5 and -2 satisfy the equation x^2 - 3x - 10 = 0
// Input: a = 1, b = 1, c = 1
// Output: Roots are complex, i.e (-0.5+i1.732 , -0.5-i1.732).
// Explanation: Roots of equation x^2 + x + 1 = 0 are imaginary.

public class RootsofaQuadraticEquation{
    public static void solution(int a, int b , int c){ 
        int d = b*b - 4*a*c;
        double sqrt = Math.sqrt(Math.abs(d));
        
        if(d > 0){
            System.out.println("Roots are real and different, i.e "+(-b+sqrt)/(2*a) +" " + (-b-sqrt)/(2*a));
        }
        else if(d == 0){
            System.out.println("Roots are real and same , i.e" + (-b)/(2*a));
        }
        else{
            System.out.println("Roots are complex, i.e ");
            System.out.println((-b)/(2*a)+ "+ i" + sqrt );
            System.out.println((-b)/(2*a)+ "- i" + sqrt );
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().replaceAll("[\\[\\]{}()<>]" , "");
        String[] parse = s.trim().split("[,\\s]+");
        
        int a , b , c;
        a = Integer.parseInt(parse[0]);
        b = Integer.parseInt(parse[1]);
        c = Integer.parseInt(parse[2]);
        solution(a, b, c);
    }
}