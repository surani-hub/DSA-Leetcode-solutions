/* https://leetcode.com/problems/count-asterisks/ */
public class CountAsterisks {
    public static void main(String[] args) {
        String s = "yo|uar|e**|b|e***au|tifu|l";
        System.out.println(countAsterisks(s));
    }

    static public int countAsterisks(String s) {
        int star = 0;
        if (s == null || s.length() == 0) {
            return star;
        }
        String[] words = s.split("\\|");
        for (int i = 0; i < words.length; i += 2) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == '*') {
                    star++;
                }
            }
        }
        return star;
    }
}
