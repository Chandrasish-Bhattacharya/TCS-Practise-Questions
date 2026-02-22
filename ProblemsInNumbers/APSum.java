
import java.util.Scanner;

public class APSum{
    public static float solution(float a, float d,int n){
        float sum = (n / 2.0f) * (2.0f * a + (n - 1) * d);
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().replaceAll("[\\[\\]{}()<>]", "");
        String[] parse = s.trim().split("[,\\s]+");
        float a = Float.parseFloat(parse[0]); 
        float d = Float.parseFloat(parse[1]);
        int n = Integer.parseInt(parse[2]); 
        System.out.println(solution(a, d, n));
    }
}