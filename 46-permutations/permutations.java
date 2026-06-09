class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        helper(nums,new ArrayList<>());
        return ans;
    }

    public void helper(int[] nums,List<Integer> list){
        if(list.size()==nums.length){
            if(!ans.contains(list)){
                ans.add(new ArrayList<>(list));
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(list.contains(nums[i])) continue;
                list.add(nums[i]);
                helper(nums,list);
                list.remove(list.size()-1);
            }
        }        
    }
    
}