public class remove_duplicate 
{
    static int removeDuplicate(int arr[])
    {
        int n=arr.length;
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                arr[count++]=arr[i];
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        int arr[] = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicate(arr);
        System.out.println("Array after removing duplicates:"+newLength);
        for(int i=0; i<newLength; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
