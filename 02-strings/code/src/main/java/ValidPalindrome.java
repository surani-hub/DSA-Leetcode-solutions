/* https://leetcode.com/problems/valid-palindrome/ */
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    static public boolean isPalindrome(String s) {
        if (s.isEmpty() || s.equals(null)) {
            return true;
        }
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
