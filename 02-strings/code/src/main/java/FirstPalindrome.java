/* https://leetcode.com/problems/find-first-palindromic-string-in-the-array/ */
public class FirstPalindrome {
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};

        System.out.println(firstPalindrome(words));
    }

    static public String firstPalindrome(String[] words) {
        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word);
            reversed.reverse();

            if (reversed.toString().equals(word)) {
                return word;
            }
        }
        return "";
    }
}
