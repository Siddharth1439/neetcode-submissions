class MinStack {
    private int[] arr;
    private int top;
    public MinStack() {
        arr = new int[1000000];
        top = -1;
    }
    
    public void push(int val) {
        if(top == arr.length){
            throw new  RuntimeException("Stack OverFlow");
        }
        top++;
        arr[top] = val;
    }
    
    public void pop() {
        if(top == -1){
            throw new  RuntimeException("Stack IsEmpty");
        }
        System.out.print(arr[top]);
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
