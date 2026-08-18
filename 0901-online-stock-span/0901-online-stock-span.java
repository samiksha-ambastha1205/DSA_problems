class StockSpanner {
    int[] prices;
    int index;

    public StockSpanner() 
    {
        prices = new int[100000];
        index=0;
    }
    
    public int next(int price) 
    {
        prices[index]=price;
        int count=1;
        int i = index-1;
        while(i>=0&&prices[i]<=price)
        {
            count++;
            i--;
        }
        index++;
        return count;
    }
}

