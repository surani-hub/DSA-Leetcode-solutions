import java.util.Stack;

/* https://leetcode.com/problems/reverse-words-in-a-string/description/ */

public class ReverseWords {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords2(s));
    }

    static public String reverseWords2(String s) {
        String[] str = s.trim().split(" ");
        int start = 0;
        int end = str.length - 1;
        while (start < end) {
            String temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }

        StringBuilder sb = new StringBuilder();
        for (String s1 : str) {
            if (!s1.equals("")) {
                sb.append(s1).append(" ");
            }
        }
        return sb.toString().trim();

    }

    static public String reverseWords(String s) {
        Stack<String> stack = new Stack<String>();
        for (String word : s.trim().split(" ")) {
            if (!word.isEmpty())
                stack.push(word);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
