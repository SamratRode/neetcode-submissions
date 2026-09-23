class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int currMin=prices[0];
        for(int i=0;i<prices.length;i++){
            int j=i+1;
            while(j<prices.length){
                if(prices[j]>=currMin){
                    profit=Math.max(profit, prices[j]-prices[i]);
                    j++;
                }
                else{
                    currMin=prices[j];
                    i=j;
                    j++;
                }
            }
        }
        return profit;
    }
}
