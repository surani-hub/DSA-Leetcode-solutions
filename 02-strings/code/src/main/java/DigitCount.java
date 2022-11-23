import java.util.HashMap;
import java.util.Map;

/* https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/ */
public class DigitCount {
    public static void main(String[] args) {
        String num = "030";

        System.out.println(digitCount(num));
    }

    static public boolean digitCount(String num) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length(); i++) {
            if (!map.containsKey(i)) {
                map.put(i, 0);
            }
        }

        for (int i = 0; i < num.length(); i++) {
            int freq = Integer.parseInt(Character.toString(num.charAt(i)));
            if (map.containsKey(freq)) {
                map.replace(freq, map.get(freq) + 1);
            }
        }

        for (int i = 0; i < num.length(); i++) {
            int freVal = Integer.parseInt(Character.toString(num.charAt(i)));
            if (map.get(i) != freVal) {
                return false;
            }
        }
        return true;
    }
}
