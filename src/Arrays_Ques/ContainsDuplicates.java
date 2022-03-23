package Arrays_Ques;
import java.util.*;
public class ContainsDuplicates {
    public static void main(String[] args){
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate(new int[]{1,2,3}));
    }
    //O(N) space and time complexity
    public static  boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n: nums){
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }
        return false;
    }
}
