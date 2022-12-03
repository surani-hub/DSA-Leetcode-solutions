import java.util.HashSet;

/* https://leetcode.com/problems/count-the-number-of-consistent-strings/description/ */
public class ConsistentString {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};

        System.out.println(countConsistentStrings(allowed, words));
    }

    static public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> charSet = new HashSet<>();
        for (char c : allowed.toCharArray())
            charSet.add(c);

        int count = 0;
        for (String word : words) {
            boolean status = true;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (!charSet.contains(ch)) {
                    status = false;
                    break;
                }
            }
            if (status) {
                count++;
            }
        }
        return count;
    }
}
