public class zer0_end_two_transversal 
{
    static void pushZeroEnd(int []arr)
    {
       int n=arr.length;
       int count=0;
       for(int i=0;i<n;i++)
       {
        if(arr[i]!=0)
        {
            arr[count++]=arr[i];
        }
       }
       while(count<arr.length)
       {
        arr[count]=0;
        count++;
       }
    }
    public static void main(String[] args) {
        int [] arr={1,5,8,0,4,0,2,0,5,9,0};
        pushZeroEnd(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
