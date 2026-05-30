class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int si=j+1;
                int li=nums.length-1;
                while(si<li){
                    long sum=nums[i]+nums[j];
                    if(sum>0 && sum>target) break;
                    sum+=nums[si]+nums[li];
                    if(sum==target){
                        List<Integer> ans=new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[si]);
                        ans.add(nums[li]);
                        if(!list.contains(ans)) list.add(ans);
                    }
                    if(sum<target) si++;
                    else li--;
                }
            }
        }
        return list;
    }
}