/* https://leetcode.com/problems/reverse-words-in-a-string-iii/ */
public class ReverseWordsIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    static public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String[] words = s.split(" ");
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                str.append(word.charAt(i));
            }
            str.append(" ");
        }
        return str.toString().trim();
    }
}
