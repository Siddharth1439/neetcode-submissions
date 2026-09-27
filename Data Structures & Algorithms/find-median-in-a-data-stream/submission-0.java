class MedianFinder {
    int[] arr;
    PriorityQueue<Integer> right = new PriorityQueue<>();
    PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
 
    public MedianFinder() {
        

   }
    
    public void addNum(int num) {
        if(left.isEmpty() || num <= left.peek()){
            left.offer(num);
        } else right.offer(num);
        // balance
        if(left.size() > right.size() + 1) right.offer(left.poll());
        if(right.size() > left.size()) left.offer(right.poll());
        
    }
    
    public double findMedian() {
          if (left.size() > right.size()) {
            return left.peek();
        }

        // Even number of elements
        return (left.peek() + right.peek()) / 2.0;
        
    }
}
