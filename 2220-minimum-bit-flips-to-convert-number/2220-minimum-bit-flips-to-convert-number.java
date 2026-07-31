class Solution {
    public int minBitFlips(int start, int goal) 
    {
        int xor = start ^ goal;
        int count=0;
        //we need to count number of 1s 
        while(xor!=0)
        {
           count+=xor&1;
           xor>>=1;
        }
        return count;
    }
}