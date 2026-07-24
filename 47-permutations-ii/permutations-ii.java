class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permuteUnique(int[] nums) {
        ans=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] vis=new boolean[nums.length];
        helper(nums,vis,new ArrayList<>());
        return ans;
    }

    void helper(int[] nums,boolean[] vis,List<Integer> list){
        if(list.size()==nums.length && !ans.contains(list)){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(vis[i]) continue;
            list.add(nums[i]);
            vis[i]=true;
            helper(nums,vis,list);
            list.remove(list.size()-1);
            vis[i]=false;

        }
    }
}