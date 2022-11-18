/* https://leetcode.com/problems/length-of-last-word/description/ */
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }

    static public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        int len = 0;
        for (int i = str.length - 1; i >= 0; i--) {
            len = str[i].length();
            break;
        }
        return len;
    }
}
