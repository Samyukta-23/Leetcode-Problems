class Solution {
    public int maxProduct(int[] nums) {
        int max1=0,max2=0;
        for(int i:nums){
            if(max1<i) max1=i;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max1){
                nums[i]=-1;
                break;
            }
        }
        for(int i:nums){
            if(max2<i) max2=i;
        }
        return (max1-1)*(max2-1);

    }
}