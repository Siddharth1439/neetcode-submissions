class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums,0,target,new ArrayList<>(),res);
        return res;
    }
    private void backtrack(int[] nums, int start,int target ,List<Integer> curr ,List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(nums[i] > target){
                continue;
            }
            curr.add(nums[i]);
            backtrack(nums,i,target-nums[i],curr,ans);

            curr.remove(curr.size()-1);
        }
    }
}
