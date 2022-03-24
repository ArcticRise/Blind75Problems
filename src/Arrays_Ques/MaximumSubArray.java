package Arrays_Ques;

import java.util.Arrays;

public class MaximumSubArray {
    public static void main(String[] args){
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max_val = Integer.MIN_VALUE;
        for(int n : nums){
            sum += n;
            if(sum>max_val){
                max_val = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max_val;
    }
}
