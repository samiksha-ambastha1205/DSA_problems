public class zero_end_one_traverse 
{
    static void pushZeroEnd(int [] arr)
    {
        int n=arr.length;
        int count=0;
        int temp;
        for(int i=0;i<n;i++)
        {

          if(arr[i]!=0)
          { 

                temp=arr[count];
                arr[count]=arr[i];
                arr[i]=temp;
            
            count++;
          
        }
        }
    }
    public static void main(String[] args) {
        int [] arr={1,6,0,4,0,7,5,0,8,0,3,0};
        pushZeroEnd(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
