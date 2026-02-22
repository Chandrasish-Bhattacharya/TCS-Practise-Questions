
import java.util.ArrayList;
import java.util.Scanner;

//let use the input format
class inputMethod {

    public static ArrayList<Integer> inputInArrayFormat() { //Case 1: [1,2,3,4,5]
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                list.add(num);
            }
        }
        return list;
    }

    public static ArrayList<Integer> inputWithSpace() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        for (String p : parts) {
            list.add(Integer.parseInt(p));
        }
        return list;
    }

    public static ArrayList<Integer> inputWithCommas() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        input = input.replace("[\\[\\]]", "");
        String[] parts = input.split(",");
        for (String p : parts) {
            list.add(Integer.parseInt(p.trim()));
        }
        return list;
    }

    public static ArrayList<Integer> parseNumbers() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // Remove all bracket types
        input = input.replaceAll("[\\[\\](){}<>]", "");

        // Split using comma OR any whitespace
        String[] parts = input.trim().split("[,\\s]+");

        for (String p : parts) {
            if (!p.isEmpty()) {               // ignore empty tokens
                list.add(Integer.parseInt(p));
            }
        }
        return list;
    }
}

public class CheckIfPrime {
    public static boolean CheckPrime(int n){
    int cnt = 0;
        for(int i = 1 ; i <=Math.sqrt(n) ; i++){
            if(n % i == 0){
                cnt++;
                if(n / i != i){
                    cnt++;
                }
            } 
        }
        return cnt == 2;
    }
    public static void main(String[] args) {
        // inputMethod inputM = new inputMethod();
        // ArrayList<Integer> list = inputM.parseNumbers();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(CheckPrime(n));
    }
}
