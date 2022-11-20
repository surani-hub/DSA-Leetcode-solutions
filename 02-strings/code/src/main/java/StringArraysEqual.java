import java.util.Arrays;

/* https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/ */
public class StringArraysEqual {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual2(word1, word2));
    }

    static public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for (String s : word1) {
            str1.append(s);
        }
        for (String s : word2) {
            str2.append(s);
        }
        if (str1.toString().equalsIgnoreCase(str2.toString())) {
            return true;
        }
        return false;
    }

    static public boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        String str1 = convertStringArrayToString(word1);
        String str2 = convertStringArrayToString(word2);
        return str1.equalsIgnoreCase(str2);
    }
    public static String convertStringArrayToString(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr)
            sb.append(str);
        return sb.substring(0, sb.length());
    }
}
