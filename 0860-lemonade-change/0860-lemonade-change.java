class Solution {
    public boolean lemonadeChange(int[] bills) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int money:bills)
        {
            map.put(money,map.getOrDefault(money,0)+1);
            if(money==10)
            {
                //do they have a 5 to return?
                if(map.getOrDefault(5,0)>0)
                {
                    map.put(5,map.get(5)-1);
                    continue;
                }
                else
                {
                    return false;
                }

            }
            else if(money==20)
            {
                //do they have 1 10 and 1 5?
                if(map.getOrDefault(10,0)>0&&map.getOrDefault(5,0)>0)
                {
                    map.put(10,map.get(10)-1);
                    map.put(5,map.get(5)-1);
                    continue;
                }
                else if(map.getOrDefault(5,0)>=3)
                {
                    map.put(5,map.get(5)-3);
                    continue;
                }
                else
                {
                    return false;
                }


            }
            
        }
        return true;
    }
}