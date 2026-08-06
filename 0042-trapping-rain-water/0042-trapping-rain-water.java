class Solution {
    public int trap(int[] height) 
    {
        Stack<Integer> stack = new Stack<>();
        int water =0;
        int bottom=0;
        for(int i =0;i<height.length;i++)//right wall
        {
          while(!stack.isEmpty()&&height[i]>height[stack.peek()])//left wall
          {
          bottom=stack.pop();
          if(stack.isEmpty())
          break;
          int left = stack.peek();
          int waterheight = Math.min(height[left],height[i])-height[bottom];
          int width = i - left -1;
          water += waterheight *width;
          }
          stack.push(i);
        }
        return water;
    }
}