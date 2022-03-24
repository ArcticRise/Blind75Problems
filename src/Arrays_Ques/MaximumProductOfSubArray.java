package Arrays_Ques;

import java.util.Arrays;

public class MaximumProductOfSubArray {
    public static void main(String[] args){
        System.out.println(maxProduct(new int[]{2,3,-2,4}));
    }
    //O(N) time and O(1) space
    public static int maxProduct(int[] nums) {
        int max_val = Arrays.stream(nums).max().getAsInt();
        int curMin = 1, curMax = 1;
        for(int n : nums){
            int temp = curMax*n;
            curMax = Math.max(Math.max(n*curMax,n*curMin),n);
            curMin = Math.min(Math.min(temp,n*curMin),n);
            max_val = Math.max(max_val,curMax);
        }
        return max_val;
    }
}
