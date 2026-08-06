class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return helper(grid,grid.length-1,grid[0].length-1,dp);
    }

    int helper(int[][] grid,int i,int j,int[][] dp){
        if(i==0 && j==0){
            return grid[i][j];
        }
        if(i==0) return grid[i][j]+helper(grid,i,j-1,dp);
        if(j==0) return grid[i][j]+helper(grid,i-1,j,dp);
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]=grid[i][j]+Math.min(helper(grid,i-1,j,dp),helper(grid,i,j-1,dp));
    }
}