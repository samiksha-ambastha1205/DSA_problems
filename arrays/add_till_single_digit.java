class add_till_single_digit 
{
    static int addDigit(int n)
    {
       while(n>=10)
       {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n=n/10;
        }
        n=sum;
       }
        
        return n;

    }
    public static void main(String[] args) {
        int n = 8875;
        System.out.println(addDigit(n));
    }
    
}
