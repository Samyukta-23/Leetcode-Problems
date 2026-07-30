class Solution {
    public int partitionDisjoint(int[] nums) {
        int[] max=new int[nums.length];
        int[] min=new int[nums.length];
        max[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(max[i-1]<nums[i])
            max[i]=nums[i];
            else{
                max[i]=max[i-1];
            }
        }

        min[min.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(min[i+1]>nums[i])
            min[i]=nums[i];
            else
            min[i]=min[i+1];
        }

        for(int i=1;i<nums.length;i++){
            if(max[i-1]<=min[i]){
                return i;
            }
        }
        return -1;
    }
}