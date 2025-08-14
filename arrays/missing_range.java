import java.util.*;
class missing_range 
{
     public static List<List<Integer>> missingRange(int [] arr , int lower, int upper)
     {
        int n =arr.length;
        List<List<Integer>> result = new ArrayList<>();
        if(lower < arr[0])
        {
            result.add(Arrays.asList(lower, arr[0]-1));
        }
        for(int i=0;i<n-1;++i)
        {
          if(arr[i+1] -arr[i]>1)
          {
            result.add(Arrays.asList(arr[i]+1,arr[i+1]-1));
            
          }
        }
        if(upper>arr[n-1])
        {
            result.add(Arrays.asList(arr[n-1]+1,upper));
        }
return result;
     } 
     public static void main(String args[])
     {
        int lower = 20;
        int upper = 40;
        int [] arr={12,14,16,20,22,24,25,28,30,35,38};
        List<List<Integer>> x = missingRange(arr, lower, upper);
        for(List<Integer> range : x)
        {
            System.out.println(range);
        }
     }
     
    
}
