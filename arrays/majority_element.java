class majority_element 
{
    
    static int majorityElement(int [] arr)
    {
        int n=arr.length;
        int x=(int)(n/2);
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>x)
            {
                return arr[i];
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(majorityElement(arr));
    }
}
