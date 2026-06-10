class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int cc=1,mc=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]-1==nums[i-1]){
                cc++;
            }
            else{
                mc=Math.max(mc,cc);
                cc=1;
            }
        }
        return Math.max(mc,cc);
    }
}