//best time to buy and sell stock

public class stockProfit {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int min = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }else{
                maxProfit = Math.max(maxProfit, prices[i] - min);
            }
        }
        System.out.println("The maximum profit is: " + maxProfit);
    }
}
