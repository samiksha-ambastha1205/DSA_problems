class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) 
    {
        Arrays.sort(arr);
        int x = arr[1]-arr[0];
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]-arr[i]==x)
            count++;

        }
        if(count==arr.length-1)
        return  true;
        return false;
        
    }
}