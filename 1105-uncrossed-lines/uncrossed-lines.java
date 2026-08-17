class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp=new int[nums1.length][nums2.length];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return helper(nums1,nums2,nums1.length-1,nums2.length-1,dp);
    }

    int helper(int[] nums1,int[] nums2,int i,int j,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(nums1[i]==nums2[j]) return 1+helper(nums1,nums2,i-1,j-1,dp);
        else{
            int left=helper(nums1,nums2,i,j-1,dp);
            int right=helper(nums1,nums2,i-1,j,dp);
            return dp[i][j]=Math.max(left,right);
        }
    }
}