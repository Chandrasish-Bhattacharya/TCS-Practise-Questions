class Solution{
    static void solve(String str, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);       // Get character
            int ascii = (int) ch;          // Get ASCII value

            if (ascii >= 65 && ascii <= 90)  // if uppercase
                result.append(Character.toLowerCase(ch)); // convert to lowercase

            else if (ascii >= 97 && ascii <= 122)  // if lowercase
                result.append(Character.toUpperCase(ch)); // convert to uppercase

            else
                result.append(ch);  // leave other characters unchanged
        }

        System.out.println("Resultant string:");
        System.out.println(result.toString());
    }
}

public class ChangeCase {
    public static void main(String[] args) {
        // Input string
        String str = "Chandrasish Is Op";
        int n = str.length();
        Solution s = new Solution();
        s.solve(str, n);
    }
}
