public class zer0_end_temp
{
    static void pushZerosToEnd(int [] arr)
    {
        int n= arr.length;
        int [] arr1 = new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr1[j++]=arr[i];
            }
        }
        for(int k=j+1;k<n;k++)
        {
            arr1[k]=0;
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=arr1[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=arr1[i];
        }
        

    }
    public static void main(String[] args) {
        int [] arr={1,5,8,0,4,0,2,0,5,9,0};
        pushZerosToEnd(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
