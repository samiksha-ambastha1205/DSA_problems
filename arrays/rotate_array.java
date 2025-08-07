import java.util.*;
public class rotate_array 
{
    static void rotateArray(int [] arr, int d)
    {
        int n=arr.length;
        for(int i=0;i<d;i++)
        {
            int first = arr[0];
            for(int j=0;j<n-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[n-1]=first;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Enter number of rotations: ");
        int d = sc.nextInt();
        rotateArray(arr, d);
        System.out.print("Rotated array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
sc.close();
}

}
