package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class seperatedigits {
    public static void main(String[] args) {
        int[] nums = {13,25,83,77};
        System.out.println(Arrays.toString(separateDigits(nums)));
    }
    static int[] separateDigits(int[] nums) {
        ArrayList<Integer> sep = new ArrayList<>();
        for(int i:nums){
            String s = ""+i;
            for(char z:s.toCharArray()){
                sep.add(Character.getNumericValue(z));
            }
        }
        int[] ans = new int[sep.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = sep.get(i);
        }
    return ans;
    }
 
}
