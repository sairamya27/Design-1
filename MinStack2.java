

class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> stack = new Stack<Integer>();
    int min = Integer.MAX_VALUE;
    
    public MinStack() {
        stack.push(min);
    }
    public void push(int val) {
        if(val<=min){
            stack.push(min);
            min = val;
        }
        stack.push(val);
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            if(min == stack.pop()){
                 min = stack.pop();
            }
        } 
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */