package DP_Ques;

public class ClimbingStairs {
    public static void main(String[] args){
        System.out.println(climbStairs(3));
    }
    public static int climbStairs(int n) {
        if(n==1)return n;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i < n+1; ++i){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
