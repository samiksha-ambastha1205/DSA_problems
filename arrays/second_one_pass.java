class second_one_pass
{
 static int second(int [] arr)
 {
    int n = arr.length;
    int largest=-1,second=-1;
    for (int i=0;i<n;i++)
    {
        if(arr[i]>largest)
        {
            second = largest;
            largest = arr[i];
        }
        else if(arr[i]>second && arr[i]!=largest)
        second=arr[i];
    }
    return second;
 }
 public static void main(String[] args) {
    int[] arr = {12, 35, 1, 10, 34, 1};
    System.out.println("The second largest element is: " + second(arr));
 }
}
