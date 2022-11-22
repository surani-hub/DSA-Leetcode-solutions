/* https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/ */
public class MaximumWordsFound {
    public static void main(String[] args) {
        String[]  sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        System.out.println(mostWordsFound(sentences));
    }

    static public int mostWordsFound(String[] sentences) {
        int maxLen = 0;

        for (String s : sentences) {
            int len = s.toLowerCase().split(" ").length;
            if (len > maxLen) {
                maxLen = len;
            }
        }
        return maxLen;
    }
}
