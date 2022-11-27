/* https://leetcode.com/problems/check-if-n-and-its-double-exist/description/ */
public class CheckDoubleExists {
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));
    }

    static public boolean checkIfExist(int[] arr) {
        boolean status = false;
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                if(i != j && arr[i] == 2 * arr[j] ){
                    status = true;
                    break;
                }
            }
        }
        return status;
    }
}
