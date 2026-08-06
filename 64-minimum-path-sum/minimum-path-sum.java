class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        int sum=0;
        for(int j=0;j<grid[0].length;j++){
            dp[0][j]=sum+grid[0][j];
            sum+=grid[0][j];
        }
        sum=0;
        for(int i=0;i<grid.length;i++){
            dp[i][0]=sum+grid[i][0];
            sum+=grid[i][0];
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }
}