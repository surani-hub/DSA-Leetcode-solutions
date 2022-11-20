/* https://leetcode.com/problems/determine-if-string-halves-are-alike/ */
public class StringHalvesAreLike {
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }

    static public boolean halvesAreAlike(String s) {
        int aVowelCount = countVowel(s.substring(0, s.length() / 2));
        int bVowelCount = countVowel(s.substring(s.length() / 2));

        if (aVowelCount == bVowelCount) {
            return true;
        }
        return false;
    }

    static public int countVowel(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
                    || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }
}
