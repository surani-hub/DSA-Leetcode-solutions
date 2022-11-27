/* https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/ */
public class CheckPanagram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    static public boolean checkIfPangram(String sentence) {
        boolean flag = true;
        if (sentence.length() < 26) {
            return false;
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (sentence.indexOf(ch) < 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
