class Solution {
    public int maxProfit(int[] prices) {
        int minimum=prices[0];
        int maxprofit=0;
       for(int price:prices){
           minimum=Math.min(minimum,price);
           maxprofit=Math.max(maxprofit,price-minimum);
       } 
       return maxprofit;
        
    }
}
