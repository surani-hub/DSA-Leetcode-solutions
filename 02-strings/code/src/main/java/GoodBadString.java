public class GoodBadString {
    public static void main(String[] args) {
        String s = "aggs2345jj";
        System.out.println(isGoodOrBad(s));
    }


    static public String isGoodOrBad(String s) {
        boolean status = false;
        if (s.length() == 0) {
            return "bad string";
        }

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) >= 97 && s.charAt(i) < 123) {
                status = true;
                continue;
            } else {
                status = false;
                break;
            }
        }
        return status ? "good string" : "bad string";
    }
}
