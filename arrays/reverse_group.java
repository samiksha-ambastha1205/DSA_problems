import java.util.*;

public class reverse_group 
{
    static void groupReverse(int [] arr, int k)
    {
      int n=arr.length;
      for(int i=0;i<n;i+=k)
      {
        int left= i;
        int right= Math.min(i+k-1,n-1);

        while (left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
      }

    }
    public static void main(String [] args)
    {
        Scanner obj= new Scanner(System.in);
        int [] arr={1,2,33,4,5,6,7,8,9,10};
        System.out.println("Enter the group size");
        int k= obj.nextInt();
        groupReverse(arr, k);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        obj.close();
    }
}

