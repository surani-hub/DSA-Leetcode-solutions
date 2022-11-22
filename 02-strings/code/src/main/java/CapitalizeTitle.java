/* https://leetcode.com/problems/capitalize-the-title/ */
public class CapitalizeTitle {
    public static void main(String[] args) {
        String title = "capiTalIze tHe titLe";
        System.out.println(capitalizeTitle(title));
    }

    static public String capitalizeTitle(String title) {
        StringBuilder capitalized = new StringBuilder();

        String[] words = title.split(" ");
        for (String word : words) {
            if (word.length() < 3) {
                capitalized.append(word.toLowerCase() + " ");
            } else {
                capitalized.append(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ");
            }
        }
        return capitalized.toString().trim();
    }
}
