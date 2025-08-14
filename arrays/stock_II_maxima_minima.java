class stock_II_maxima_minima 
{
    static int maxProfit(int [] arr)
    {
        int n = arr.length;
        int lMin=arr[0];
        int lMax=arr[0];
        int res=0;
        int i=0;
        while(i<n-1)
        {
         while(i<n-1 &&arr[i]>=arr[i+1])
          {
            i++;
          }
          lMin=arr[i];
          while(i<n-1 && arr[i]<=arr[i+1])
          {
            i++;
          }
          lMax=arr[i];
          res+=(lMax-lMin);
        }
        return res;



    }
    public static void main (String args[])
    {
        int [] arr={100,180,260,310,40,535,695};
        System.out.println(maxProfit(arr));
    }
    
}

