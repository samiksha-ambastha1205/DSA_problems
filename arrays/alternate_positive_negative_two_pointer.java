
import java.util.*;
class alternate_positive_negative_two_pointer 
{
    static void rearrange(ArrayList<Integer>arr)
    {
        ArrayList<Integer>positive = new ArrayList<>();
        ArrayList<Integer>negative = new ArrayList<>();

        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)>=0)
            {
                positive.add(arr.get(i));
            
            }
            else
            {
                negative.add(arr.get(i));
            }
        }

        int posIndex = 0, negIndex = 0;
        int i=0;
        while(posIndex<positive.size() &&negIndex<negative.size())
        {
            if(i%2==0)
            {
                arr.set(i++,positive.get(posIndex++));
            }
            else
            {
                arr.set(i++,negative.get(negIndex++));
            }
        }

        while(posIndex<positive.size())
        {
            arr.set(i++,positive.get(posIndex++));
        }
        while(negIndex<negative.size())
        {
            arr.set(i++,negative.get(negIndex++));
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, -4, -1, 4));

        rearrange(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
    
}
