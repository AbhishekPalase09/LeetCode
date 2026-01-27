public class BuySellStock {
   public int maxProfit(int[] prices) {
        int min = prices[0], max = 0;
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                if((prices[j]-prices[i])>max){
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }
}
