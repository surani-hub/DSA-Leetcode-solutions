/* https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/ */
public class PrefixString {
    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = {"i","love","leetcode","apples"};

        System.out.println(isPrefixString(s, words));
    }

    static public boolean isPrefixString(String s, String[] words) {
        String[] prefixArr = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                prefixArr[i] = sb.append(words[j]).toString();
            }
        }
        for (String prefix : prefixArr) {
            if (prefix.contentEquals(s)) {
                return true;
            }
        }
        return false;
    }
}
