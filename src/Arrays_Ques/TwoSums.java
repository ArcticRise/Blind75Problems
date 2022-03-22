package Arrays_Ques;
import java.util.*;
public class TwoSums {
    public static void main(String[] args){
        int nums[] = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums,9)));
        System.out.println(Arrays.toString(twoSum2(nums,9)));
    }

    //This is O(N^2)
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; ++i){
            for(int j = i+1; j < nums.length; ++j){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,1};
    }

    //HashMap Implentation
    //O(N) time and O(N) Space complexity as we might have to add all elements
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; ++i){
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i],i);
            }else{
                return new int[]{map.get(target-nums[i]),i};
            }
        }
        return new int[]{0,1};
    }
}
