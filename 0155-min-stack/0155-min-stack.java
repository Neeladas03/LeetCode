class MinStack {

    ArrayList<Integer>stack;
    ArrayList<Integer>minstack;

    public MinStack() {
        stack=new ArrayList<>();
        minstack=new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
        if(minstack.isEmpty() || val<=(minstack.get(minstack.size()-1))){
            minstack.add(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty())return;
        int removed=stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        if(removed==minstack.get(minstack.size()-1)){
            minstack.remove(minstack.size()-1);
        }
    }
    
    public int top() {
        if(stack.isEmpty())return -1;
        int top=stack.get(stack.size()-1);
        return top;

    }
    
    public int getMin() {
        if(stack.isEmpty())return -1;
        return minstack.get(minstack.size()-1);
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