public class remove_occurence 
{
    static int removeOccurence(int arr[], int ele)
    {
        int k = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != ele)
            {
                arr[k++] = arr[i];  
            }
        }
        return k;  
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 0, 4, 0, 2, 0, 5, 9, 0};
        int ele = 0;
        int newLength = removeOccurence(arr, ele);
        System.out.println("Array after removing occurrences has length " + newLength + ":");
        for (int i = 0; i < newLength; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
