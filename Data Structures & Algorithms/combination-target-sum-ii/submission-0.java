class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates,0,target,new ArrayList<>(),res);
        return res;
    }
    private void backtrack(int[] nums,int start,int target,List<Integer> curr,List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start; i < nums.length;i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            if(nums[i] > target) break;
        curr.add(nums[i]);
        backtrack(nums,i+1,target-nums[i],curr,res);

        curr.remove(curr.size()-1);}
    }
}
