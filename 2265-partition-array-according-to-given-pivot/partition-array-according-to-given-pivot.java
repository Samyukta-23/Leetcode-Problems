class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans=new int[nums.length];
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                ans[left]=nums[i];
                left++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                ans[left]=nums[i];
                left++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                ans[left]=nums[i];
                left++;
            }
        }
        return ans;
    }
}