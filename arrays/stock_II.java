class stock_II 
{
    static int maxProfit(int [] arr, int start , int end)
    {
        int res=0;
        for(int i=start;i<end;i++)
        {
            for(int j=i+1;j<=end;j++)
            {
                if(arr[i]<arr[j])
                {
                    int curr=(arr[j]-arr[i])+maxProfit(arr,start,i-1)+maxProfit(arr,j+1,end);
                    res=Math.max(res,curr);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr = {100, 180, 260, 310, 40, 535, 695};

        int n = arr.length;
        System.out.println(maxProfit(arr, 0, n - 1));
    }
    
}
