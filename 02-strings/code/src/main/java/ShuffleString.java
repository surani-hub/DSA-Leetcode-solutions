/* https://leetcode.com/problems/shuffle-string/ */
public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

        System.out.println(restoreString(s, indices));
    }

    static public String restoreString(String s, int[] indices) {
        char[] ans = new char[s.length()];
        for (int index = 0; index < indices.length; index++) {
            ans[indices[index]] = s.charAt(index);
        }
        StringBuilder shuffle = new StringBuilder();
        for (char c : ans) {
            shuffle.append(c);
        }
        return shuffle.toString().trim();
    }
}
