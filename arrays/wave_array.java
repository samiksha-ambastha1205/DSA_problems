public class wave_array
{ 
    static void waveArray(int [] arr)
{
    int n = arr.length;
    for(int i=0;i<n-1;i+=2) 
    {
        if(i+1<n && arr[i]<arr[i+1])
        {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    
}
public static void main(String args[])
{
    int []arr = {1, 2, 3, 4, 5};
    waveArray(arr);
    System.out.println("sorted array = ");
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i] + " ");
    }

}
    
}
