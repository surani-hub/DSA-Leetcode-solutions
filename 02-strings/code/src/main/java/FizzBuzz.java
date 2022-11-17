import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* https://leetcode.com/problems/fizz-buzz/ */
public class FizzBuzz {
    public static void main(String[] args) {
        int n = 3;
        List<String> list = fizzBuzz(n);
        System.out.println(list);
    }

    static public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        int temp = 0;
        for(int i=1; i<=n; i++){
            if(i % 3 == 0){
                if(i % 5 == 0){
                    list.add(temp, "FizzBuzz");
                }else{
                    list.add(temp, "Fizz");
                }
            }else if(i % 5 == 0){
                list.add(temp, "Buzz");
            }else{
                list.add(temp, String.valueOf(i));
            }
            temp++;
        }
        return list;
    }
}
