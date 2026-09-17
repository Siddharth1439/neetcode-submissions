class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] prefix = new int[n];
        int[] sufix = new int[n];
        prefix[0] = height[0];
        sufix[n-1] = height[n-1];
        for(int i=1;i<n;i++){
            prefix[i] = Math.max(prefix[i-1],height[i]);
        } 
        for(int i=n-2;i>=0;i--){
            sufix[i] = Math.max(sufix[i+1],height[i]);
        }
        int water = 0;
        for(int i=0;i<n;i++){
            water += Math.min(prefix[i],sufix[i]) - height[i];
        }
        return water;
    }
}
