import java.util.*;
class product_array_self {
static int[] productArray(int[] arr)
{
        int n = arr.length;
        int [] x = new int[n];
            Arrays.fill(x, 1);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    x[i]*=arr[j];
                }
            }
            
            
        }
        return x;
        

    
}
public static void main(String[] args) {
            int[] arr = {10, 3, 5, 6, 2};
            int[] result = productArray(arr);
            System.out.println(Arrays.toString(result));
        }
}
