package Arrays_Ques;

import java.util.Arrays;

public class MininRotatedSortedArray {
    public static void main(String[] args){
        System.out.println(findMin(new int[]{3,4,5,1,2}));
    }
    //O(log n) time binary search
    public static int findMin(int[] nums) {
        int ans = nums[0];
        int left = 0, right = nums.length-1;
        while(left <= right){
            if(nums[left] < nums[right]){
                ans = Math.min(ans,nums[left]);
                break;
            }
            int mid = (left + right) / 2;
            ans = Math.min(ans,nums[mid]);
            if (nums[mid] >= nums[left]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
}
