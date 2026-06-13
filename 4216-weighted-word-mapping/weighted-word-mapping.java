class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans=new StringBuilder();
        for(String str:words){
            int sum=0;
            for(char ch:str.toCharArray()){
                sum+=weights[ch-'a'];
            }
            sum%=26;
            ans.append((char)('a'+26-sum-1));
        }
        return ans.toString();
    }
}