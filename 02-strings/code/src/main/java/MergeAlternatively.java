/* https://leetcode.com/problems/merge-strings-alternately/ */
public class MergeAlternatively {
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }

    static public String mergeAlternativelyUsingTwoPointer(String word1, String word2) {
//        StringBuilder sb = new StringBuilder(word1.length()+word2.length());
//
//        int min = Math.min(word1.length(), word2.length());
//        for(int start=0;start<=min;start++){
//            sb.append(word1.charAt(start)).append(word2.charAt(start));
//        }
//        for(int start = min; start<sb.length();start++){
//            sb.append()
//        }
        return null;
    }

    static public String mergeAlternately(String word1, String word2) {
        int lenWord1 = word1.length();
        int lenWord2 = word2.length();

        int min = Math.min(lenWord1, lenWord2);

        StringBuilder mergedString = new StringBuilder();

        for (int i = 0; i < min; i++) {
            mergedString.append(word1.charAt(i));
            mergedString.append(word2.charAt(i));
        }

        if (lenWord1 >= min) {
            mergedString.append(word1.substring(min));
        }
        if (lenWord2 >= min) {
            mergedString.append(word2.substring(min));
        }
        return mergedString.toString().trim();
    }
}
