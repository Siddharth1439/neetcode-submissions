class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if(nums.length == 0) return 0;
        int max = 1;
        for(int num:nums) set.add(num);
        for(int num:nums){
            int count = 1;
            if(!set.contains(num-1)){
                int s = num;
                while(set.contains(s+1)) {count++; s++;}
                max = Math.max(max,count);
                
            }
        }
        return max;
    }
}
