class moutain 
{
    static int findMountain(int [] arr)
    {
        int length=0;
        int n=arr.length;

        for(int i=0;i<n;i++)
        {
            int j=i+1;
            int inc=0,dec=0;

            while(j<n &&arr[j]>arr[j-1])
            {
                inc=1;
                j++;

            }
            while(j<n &&arr[j]<arr[j-1])
            {
                dec=1;
                j++;
            }
            if(inc==1 &&dec==1)
            {
                length=Math.max(length,j-i);
            }

            
        }
        return length;
    }
    public static void main (String[] args) 
    {
        int [] d={1,3,5,7,9,4,7,6,5,5,4,3,2,1,0};
        System.out.println(findMountain(d));

    
     }
    
}
