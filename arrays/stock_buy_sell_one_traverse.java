class stock_buy_sell_one_traverse
{
    static int maxProfit(int arr[])
    {
        int n= arr.length;
        int minsofar=arr[0];
        int res=0;
        for(int i=1;i<n;i++)
        {
            minsofar=Math.min(minsofar, arr[i]);
            res=Math.max(res,arr[i]-minsofar);
        }
        return res;
    }
    public static void main(String args[])
    {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
    }
    
}
