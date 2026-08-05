class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            if(grid[i][0]==1)break;
            dp[i][0]=1;
        }
        for(int j=0;j<grid[0].length;j++){
            if(grid[0][j]==1) break;
            dp[0][j]=1;
        }

        for(int i=1;i<grid.length;i++){
            for(int j=1;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    dp[i][j]=0;
                    continue;
                }
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
       return dp[grid.length-1][grid[0].length-1];
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