import java.util.HashMap;
import java.util.Map;

/* https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/ */
public class SumEquals {
    public static void main(String[] args) {
        String firstWord = "acb", secondWord = "cba", targetWord = "cdb";

        System.out.println(isSumEqual(firstWord, secondWord, targetWord));

    }

    static public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        Map<Integer, Integer> alphabet = new HashMap<>();
        StringBuilder word1 = new StringBuilder();
        StringBuilder word2 = new StringBuilder();
        StringBuilder word3 = new StringBuilder();

        if (firstWord == null || secondWord == null || targetWord == null) {
            return true;
        }

        for (int i = 0; i < 26; i++) {
            alphabet.put('a' + i, i);
        }

        for (int i = 0; i < firstWord.length(); i++) {
            word1.append(alphabet.get((int) firstWord.charAt(i)));
        }

        for (int i = 0; i < secondWord.length(); i++) {
            word2.append(alphabet.get((int) secondWord.charAt(i)));
        }

        int target = Integer.parseInt(word1.toString()) + Integer.parseInt(word2.toString());
        for (int i = 0; i < targetWord.length(); i++) {
            word3.append(alphabet.get((int) targetWord.charAt(i)));
        }
        if (target != Integer.parseInt(word3.toString())) {
            return false;
        }
        return true;
    }
}
