class max_consecutive_xor {
public int maxConsecutiveXor(int [] arr)
{
    int n=arr.length;
    if(n==0) return 0;

    int maxCount=0,count=1,prev=-1;
    for(int i=0;i<n;i++)
    {
     if((prev^arr[i])==0)
     {
        count++;
     }
     else
     {
        maxCount=Math.max(maxCount,count);
        count=1;
     }
     prev=arr[i];
    }
return Math.max(maxCount, count);
}
public static void main(String[] args)
{
    max_consecutive_xor obj = new max_consecutive_xor();
    int [] arr = {1, 1, 0, 0, 1, 1, 0, 0};
    System.out.println("Maximum consecutive XOR: " + obj.maxConsecutiveXor(arr));
}
}

