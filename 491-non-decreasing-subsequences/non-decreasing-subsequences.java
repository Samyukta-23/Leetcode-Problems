class Solution {
    Set<List<Integer>> ans;
    public List<List<Integer>> findSubsequences(int[] nums) {
        ans=new HashSet<>();
        List<List<Integer>> res=new ArrayList<>();
        helper(new ArrayList<>(),nums,0);
        for(List<Integer> list:ans){
            res.add(list);
        }
        return res;
    }

    void helper(List<Integer> res,int[] nums,int in){
        if(res.size()>1) ans.add(new ArrayList<>(res));
        for(int i=in;i<nums.length;i++){
            res.add(nums[i]);
            if(res.size()>1){
                if(res.get(res.size()-2)>nums[i]){
                    res.remove(res.size()-1);
                    continue;
                }
            }
            helper(res,nums,i+1);
            res.remove(res.size()-1);
        }
    }
}