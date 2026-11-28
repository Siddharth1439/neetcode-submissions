class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0;
        int right = n-1;
        int max_value = Integer.MIN_VALUE;
        while(left<right){
            int curr = Math.min(heights[left],heights[right]) * (right-left);
            max_value = Math.max(max_value,curr);
            if(heights[left] < heights[right]){
                left++;
            } else right--;
        }
        return max_value;
    }
}
