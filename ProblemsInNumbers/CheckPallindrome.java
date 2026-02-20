public class CheckPallindrome{
    public static boolean solution(int n){
        int reverseNum = 0;
        int dub = n;
        while(n>0){
            int lastDigit = n % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            n /= 10;
        }
        return reverseNum == dub ? true : false;
    }
    public static void main(String[] args){
        int n = 1231;
        System.out.print(solution(n));
    }
}