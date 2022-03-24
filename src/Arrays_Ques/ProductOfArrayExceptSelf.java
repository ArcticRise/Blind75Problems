package Arrays_Ques;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args){
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    }

    //Algorithm time O(N), O(1)
    //1 2 3 4 -> prefix (1,1,2,6) ->postfix(1,4,12,24) -> = 24 12 8 6
    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int temp = 1;
        for(int i = 0; i < nums.length; ++i){
            output[i] = temp;
            temp *= nums[i];
        }
        int temp2 = 1;
        for(int i = nums.length-1; i >= 0; --i){
            output[i] *= temp2;
            temp2 *= nums[i];
        }
        return output;
    }
}
