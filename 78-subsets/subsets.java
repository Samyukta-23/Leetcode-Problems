class Solution {
    static List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        ans=new ArrayList<>();
        helper(nums,new ArrayList<Integer>(),0);
        return ans;
    }

    void helper(int[] nums,ArrayList<Integer> current,int index){ 
        ans.add(new ArrayList<>(current));
        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);
            helper(nums,current,i+1);
            current.remove(current.size()-1);
        }
    }
}