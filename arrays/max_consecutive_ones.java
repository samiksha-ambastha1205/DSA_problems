class max_consecutive_ones 
{
    static int maxOnes(int [] arr, int k)
    {
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++)
        {
            int cnt=0;
            for(int j=i;j<n;j++)
            {
                if(arr[j]==0)
                {
                    cnt++;
                }
                if(cnt<=k)
                {
                    res=Math.max(res,(j-i+1));
                }

            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr= { 1,0,0,1,1,0,1,0,1,1,1};
        int k=2;
        System.out.println(maxOnes(arr,k));
    
}
}
