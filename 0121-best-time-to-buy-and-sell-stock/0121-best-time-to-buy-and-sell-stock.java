class Solution {
    public int maxProfit(int[] prices) {

        /*int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;        
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;*/
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i =0;i<prices.length;i++)
        {
            if(prices[i]<minprice)
            {
                minprice=prices[i];
            }
            else
            {
                maxprofit = Math.max(maxprofit,prices[i]-minprice);
            }
        }
        return maxprofit;







    }
}
