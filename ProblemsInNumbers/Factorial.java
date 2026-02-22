public class Factorial{
    public static int fact(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return n * fact(n - 1);
    }
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1 ; i <= n ; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(fact(n));
        System.out.println(factorial(n));
    }
}