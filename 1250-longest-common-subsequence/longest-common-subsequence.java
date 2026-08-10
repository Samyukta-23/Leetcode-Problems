class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return lcs(text1.length()-1,text2.length()-1,text1,text2,dp);
    }

    int lcs(int i,int j,String s1,String s2,int[][] dp){
        if(i==-1 || j==-1){
            return 0;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return 1+lcs(i-1,j-1,s1,s2,dp);
        }
        return dp[i][j]=Math.max(lcs(i-1,j,s1,s2,dp),lcs(i,j-1,s1,s2,dp));
    }
}