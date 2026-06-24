class Solution {
    public String convertToTitle(int c) {
        StringBuilder ans=new StringBuilder();
        while(c>0){
            c--;
            int r=c%26;
            ans.insert(0,(char)(r+'A'));
            c/=26;
        }
        return ans.toString();
    }
}