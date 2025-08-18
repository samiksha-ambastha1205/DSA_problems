import java.util.*;
class sort_equation 
{
    static int evaluate(int x, int A, int B, int C)
    {
        return A*x*x+B*x+C;
    }
    static int[] sortArray(int [] arr, int A, int B, int C)
    {
        int n=arr.length;
        int [] sorted= new int[n];
        for(int i=0;i<n;i++)
        {
            sorted[i]=evaluate(arr[i],A,B,C);

        }
        Arrays.sort(sorted);
     return sorted;
    }
    
    public static void main(String[] args) {
        int[] arr = { -4, -2, 0, 2, 4 }; 
        int A=1,B=3,C=5;
        int result[] = sortArray(arr,A,B,C);
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    

    }
    
    
}
