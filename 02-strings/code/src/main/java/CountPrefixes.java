import java.util.Arrays;

/* https://leetcode.com/problems/count-prefixes-of-a-given-string/ */
public class CountPrefixes {
    public static void main(String[] args) {
        String[] words = {"a","b","c","ab","bc","abc"};
        String s = "abc";

        System.out.println(countPrefixes(words, s));
    }

    static public int countPrefixes(String[] words, String s) {
        String[] prefixArr = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            prefixArr[i] = s.substring(0, s.length() - i);
        }
        int count = 0;
        for (String word : words) {
            for (String prefix : prefixArr) {
                if (word.contentEquals(prefix)) {
                    count++;
                }
            }
        }
        return count;
//        return (int)Arrays.stream(words).filter(s::startsWith).count();
    }
}
