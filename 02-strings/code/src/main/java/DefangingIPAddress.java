/* https://leetcode.com/problems/defanging-an-ip-address/ */
public class DefangingIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }

    static public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
