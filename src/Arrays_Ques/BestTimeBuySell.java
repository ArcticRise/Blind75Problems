package Arrays_Ques;

public class BestTimeBuySell {

    public static void main(String[] args){
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {
        int left = 0, right = 1;
        int max = 0;
        while(right < prices.length){
            if(prices[left] < prices[right]){
                int profit = prices[right] - prices[left];
                max = Math.max(max,profit);
            }else{
                left = right;
            }
            right += 1;

        }
        return max;
    }
}
