class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] ans=new int[nums.length];
        Arrays.fill(ans,-1);
        int i=0,j=0;
        long sum=0;
        for(j=0;j<nums.length;j++){
            sum+=nums[j];
            if(j-i+1==2*k+1){
                ans[i+k]=(int)(sum/(2*k+1));
                i++;
                sum-=nums[i-1];
            }
        }
        return ans;
    }
}