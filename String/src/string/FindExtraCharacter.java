package string;
public class FindExtraCharacter {

    // LeetCode required method
    public char findTheDifference(String s, String t) {
        int xor = 0;

        // XOR all characters of s
        for (char c : s.toCharArray()) {
            xor ^= c;
        }

        // XOR all characters of t
        for (char c : t.toCharArray()) {
            xor ^= c;
        }

        // Remaining value is the extra character
        return (char) xor;
    }

    // Main method for local testing
    public static void main(String[] args) {
        FindExtraCharacter solution = new FindExtraCharacter();

        String s = "abcd";
        String t = "abcde";

        char result = solution.findTheDifference(s, t);
        System.out.println("Extra character is: " + result);
    }
}
