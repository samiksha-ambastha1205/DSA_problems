class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minstack;
    int min = Integer.MAX_VALUE;

    public MinStack() 
    {
        stack= new Stack<>();
        minstack= new Stack<>();
    }
    
    public void push(int value) 
    {
        stack.push(value);
        if(minstack.isEmpty()||value<=minstack.peek())
        {
            minstack.push(value);
            
        }
    }
    
    public void pop() 
    {
        int val = stack.pop();
        if(!minstack.isEmpty() && minstack.peek().equals(val))
        minstack.pop();

    }
    
    public int top() 
    {
        return stack.peek();
    }
    
    public int getMin() 
    {
        if(!minstack.isEmpty())
        return minstack.peek();
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */