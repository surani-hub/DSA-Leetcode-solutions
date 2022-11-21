/* https://leetcode.com/problems/sorting-the-sentence/ */
public class SortingSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";

        System.out.println(sortSentence(s));
    }

    static public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] ans = new String[words.length];
        for (String word : words) {
            int digit = Integer.parseInt(word.substring(word.length() - 1));
            ans[digit - 1] = word;
        }
        StringBuilder sb = new StringBuilder();
        for (String a : ans) {
            sb.append(a.substring(0, a.length() - 1) + " ");
        }
        return sb.toString().trim();
    }
}
