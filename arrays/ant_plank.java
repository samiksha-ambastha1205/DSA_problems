class ant_plank 
{
    static int getlastMoment(int n,int [] left, int [] right)
    {
        int res=0;
        for(int i=-0;i<left.length;i++)
        {
            res=Math.max(res,left[i]);
        }
        for(int i=0;i<right.length;i++)
        {
            res=Math.max(res,n-right[i]);
        }
        return res;
    }
    public static void main(String args[])
    {
        int [] left ={2};
        int [] right ={0,1,3};
        int n=4;
        System.out.println(getlastMoment(n, left, right));
    }
    
}
