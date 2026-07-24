class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permuteUnique(int[] nums) {
        ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(nums);
        boolean[] vis=new boolean[nums.length];
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        helper(nums,vis,new ArrayList<>(),map);
        return ans;
    }

    void helper(int[] nums,boolean[] vis,List<Integer> list,HashMap<Integer,Integer> map){
        if(list.size()==nums.length && !ans.contains(list)){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(vis[i]) continue;
            if(map.get(nums[i])>0){
                map.put(nums[i],map.get(nums[i])-1);
                list.add(nums[i]);
                vis[i]=true;
                helper(nums,vis,list,map);
                list.remove(list.size()-1);
                vis[i]=false;
                map.put(nums[i],map.get(nums[i])+1);
            }

        }
    }
}