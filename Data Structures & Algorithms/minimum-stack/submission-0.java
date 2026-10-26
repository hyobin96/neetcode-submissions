class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> extraStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        extraStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);

        if (extraStack.isEmpty() || extraStack.peek() >= val) {
            extraStack.push(val);
        }
    }
    
    public void pop() {
        int top = stack.pop();
        if (extraStack.peek().equals(top)) {
            extraStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return extraStack.peek();
    }
}
