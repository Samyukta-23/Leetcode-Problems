class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
       return helper(grid,0,0,dp);
    }
    int helper(int[][] grid,int i,int j,int[][] dp){
        if(i>=grid.length || j>=grid[0].length || grid[i][j]==1){
            return 0;
        }
        if(i==grid.length-1 && j==grid[0].length-1){
            return 1;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]=helper(grid,i+1,j,dp)+helper(grid,i,j+1,dp);
    }
}