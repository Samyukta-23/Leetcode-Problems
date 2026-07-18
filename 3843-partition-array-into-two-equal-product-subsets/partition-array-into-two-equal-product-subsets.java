class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        if(helper(nums,0,target,1)){
            long p=1;
            for(int num:nums){
                if(num!=-1){
                    p*=num;
                }
            }
            return p==target;
        }
        return false;
    }

    boolean helper(int[] nums,int in,long target,long prod){
        if(prod==target) return true;
        if(prod>target) return false;
        for(int i=in;i<nums.length;i++){
            if(nums[i]==-1) continue;
            prod*=nums[i];
            int temp=nums[i];
            nums[i]=-1;
            if(helper(nums,i+1,target,prod)){
                return true;
            }
            nums[i]=temp;
            prod/=nums[i];
        }
        return false;
    }
}