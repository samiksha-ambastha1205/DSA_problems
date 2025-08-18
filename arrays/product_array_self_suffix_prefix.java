import java.util.Arrays;
class product_array_self_suffix_prefix 
{
 static int[] productSelf(int [] arr)
 {
    int n=arr.length;
    int [] prefix= new int[n];
    int [] suffix = new int[n];
    int [] res=new int[n];

    prefix[0]=1;
    for(int i=1;i<n;i++)
    {
        prefix[i]= arr[i-1]*prefix[i-1];
    }
    suffix[n-1]=1;
    for(int i=n-2;i>=0;i--)
    {
        suffix[i]=arr[i+1]*suffix[i+1];
    }
    for(int i=0;i<n;i++)
    {
        res[i]=suffix[i]*prefix[i];
    }
    return res;
 }
 public static void main(String[] args) 
 {
    int [] arr={10,3,5,6,2};
    System.out.println(Arrays.toString(productSelf(arr)));
 }
    
}
