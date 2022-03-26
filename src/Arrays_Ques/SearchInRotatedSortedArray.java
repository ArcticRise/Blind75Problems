package Arrays_Ques;

public class SearchInRotatedSortedArray {
    public static void main(String[] args){
        System.out.println(search(new int[]{3,4,5,1,2}, 1));
    }

    //Binary Search
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            }
            //Left sorted Portion
            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{ // Right Portion
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
