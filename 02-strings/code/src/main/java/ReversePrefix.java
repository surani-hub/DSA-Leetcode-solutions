/* https://leetcode.com/problems/reverse-prefix-of-word/ */
public class ReversePrefix {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';

        System.out.println(reversePrefix(word, ch));
    }

    static public String reversePrefix(String word, char ch) {
        int firstOcr = word.indexOf(ch);
        String str = word.substring(0, firstOcr + 1);

        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();

        return reversed.append(word.substring(firstOcr + 1)).toString();

    }
}
