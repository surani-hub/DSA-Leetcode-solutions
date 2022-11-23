/* https://leetcode.com/problems/percentage-of-letter-in-string/ */
public class PercentageLetter {
    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';

        System.out.println(percentageLetter(s, letter));

    }

    static public int percentageLetter(String s, char letter) {
        double count = 0;
        int strLen = s.length();
        for (int i = 0; i < strLen; i++) {
            if (s.charAt(i) == letter) {
                count++;
            }
        }
        return (int) Math.floor(count / strLen * 100);
    }
}
