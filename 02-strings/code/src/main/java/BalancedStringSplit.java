/* https://leetcode.com/problems/split-a-string-in-balanced-strings/ */
public class BalancedStringSplit {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }

    static public int balancedStringSplit(String s) {
        int balance = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                balance++;
            } else if (s.charAt(i) == 'R') {
                balance--;
            }
            if (balance == 0) {
                count++;
            }
        }
        return count;
    }
}
