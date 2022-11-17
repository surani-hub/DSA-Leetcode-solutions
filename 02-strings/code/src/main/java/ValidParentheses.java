import java.util.Stack;

/* https://leetcode.com/problems/valid-parentheses/ */
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(]";
        System.out.println(isValid(s));
    }

    static public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s == null || s.length() == 0) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
