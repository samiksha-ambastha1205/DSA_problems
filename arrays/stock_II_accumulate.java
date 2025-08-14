class stock_II_accumulate 
{
    static int maxProfit(int [] arr)
    {
        int res=0;
        for(int i=1;i<arr.length;i++)
        {
            
                if(arr[i] >arr[i-1])
                {
                    res+=arr[i] -arr[i-1];
                }
              }
              return res;
            }
    public static void main (String args[])
    {
        int [] arr={100,180,260,310,40,535,695};
        System.out.println(maxProfit(arr));
        }
    }
    
    

