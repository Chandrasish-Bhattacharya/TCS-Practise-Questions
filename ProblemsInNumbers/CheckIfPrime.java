
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

    public static void main(String[] args) {
        inputMethod inputM = new inputMethod();
        ArrayList<Integer> list = inputM.inputWithCommas();
        System.out.println("Case 3: 1,2,3,4,5");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
