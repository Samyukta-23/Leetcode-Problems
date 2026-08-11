class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()][word2.length()];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return helper(word1.length()-1,word2.length()-1,word1,word2,dp);
    }

    int helper(int i,int j, String s1,String s2,int[][] dp){
        if(i<0 && j<0) return 0;
        if(i<0){
            return 1+helper(i,j-1,s1,s2,dp);
        }
        if(j<0){
            return 1+helper(i-1,j,s1,s2,dp);
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return helper(i-1,j-1,s1,s2,dp);
        }
        else{
            int left=1+helper(i-1,j,s1,s2,dp);
            int right=1+helper(i,j-1,s1,s2,dp);
            return dp[i][j]=Math.min(left,right);
        }
        
    }
}