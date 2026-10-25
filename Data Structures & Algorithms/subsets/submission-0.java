class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),res);
        return res;
    }
    private void backtrack(int[] nums,int i,List<Integer> curr,List<List<Integer>> res){
        if(nums.length == i){
            res.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[i]);
        backtrack(nums,i+1,curr,res);

        curr.remove(curr.size()-1);
        backtrack(nums,i+1,curr,res);
    }
}
