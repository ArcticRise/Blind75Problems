package Arrays_Ques;

public class ContainerWithMostWater {
    public static void main(String[] args){
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    //Two pointer approach O(n) time complexity
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max_val = -1;
        while(left < right){
            max_val = Math.max(max_val,Math.min(height[left],height[right])*(right-left));
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max_val;
    }
}
