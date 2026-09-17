class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int max = Integer.MIN_VALUE;
        while(left < right){
            int n = Math.min(heights[left],heights[right])*(right - left);
            max = Math.max(max,n);
            if(heights[left] < heights[right]) left++;
            else right--; 
        }
        return max;
    }
}
