/* https://leetcode.com/problems/truncate-sentence/ */
public class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;

        System.out.println(truncateSentence(s, k));
    }

    static public String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < k; i++) {
            newStr.append(str[i] + " ");
        }
        return newStr.toString().trim();
    }
}
