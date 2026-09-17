class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        int max = 0;
        for(int num:nums) set.add(num);
        for(int num:nums){
            if(set.contains(num-1)) continue;
            int curr = num;
            int count =1;
            while(set.contains(curr+1)){
                count++;
                curr++;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
