package DP_Ques;

public class CoinChange {
    public static void main(String [] args){
        int[] coins = {1,2,3,4};
        System.out.println(coinChange(coins,11));
    }
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for(int i = 1; i < amount+1; ++i){
            dp[i] = amount+1;
            for(int coin : coins){
                if(i-coin >= 0){
                    dp[i] = Math.min(dp[i],1+dp[i-coin]);
                }
            }
        }
        if(dp[amount] == amount+1){
            return -1;
        }
        return dp[amount];
    }
}
