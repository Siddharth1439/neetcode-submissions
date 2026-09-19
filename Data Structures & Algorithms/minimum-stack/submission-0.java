class MinStack {
     private int top;
     private int[] arr;

    public MinStack() {
        arr = new int[10000];
        top = -1;
    }
    
    public void push(int val) {
        if(top == arr.length-1){
            throw new RuntimeException("Stack Overflow");
        }
        top++;
        arr[top] = val;
    }
    
    public void pop() {
        if(top == -1){
            throw new RuntimeException("Stack isEmpty");
        }
        arr[top] = 0;
        top--;
    }
    
    public int top() {
        return arr[top];
    }
    public int getMin() {
    int min = Integer.MAX_VALUE;
    int i = top;

    while(i > -1) {
        min = Math.min(min, arr[i]);
        i--;
    }

    
   
    
        return min;
    }
}
