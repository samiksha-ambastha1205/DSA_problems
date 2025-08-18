class subarray_less_than_k 
{
    
 static int countSubarray(int []arr, int k)
 {
    int n=arr.length;
    int count=0;
    
    for(int i=0;i<n;i++)
    {
        if(arr[i] <k)
        {
            count++;
        }
        int prod=arr[i];
        for(int j=i+1;j<n;j++)
        {

           prod*=arr[j];
           if(prod<k)
           {
            count++;
           }
        }
    }
    return count;
 }
 public static void main(String[] args) 
 {
    int [] arr={1,2,3,4};
    int k=10;
    System.out.println(countSubarray(arr, k));
 }
}
