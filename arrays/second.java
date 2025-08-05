import java.util.Arrays;
class close
{
    static int second(int[] arr)
{
    int x=arr.length;
    if(x<2) return -1;
    Arrays.sort(arr);
    for(int i=x-2;i>=0;i--)
    {
     if(arr[i]!=arr[x-1])
     {
        return arr[i];

     }

    }
          return -1;

}
public static void main(String args[])
{
    int[] arr={12,45,78,23,54,67,89,12,34};
    System.out.println("The second largest element is: " + second(arr));


}
}