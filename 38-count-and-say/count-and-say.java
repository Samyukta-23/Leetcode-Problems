class Solution {
    StringBuilder ans;
    public String countAndSay(int n) {
        ans=new StringBuilder("1");
        for(int i=2;i<=n;i++){
            ans=count(ans);
        }
        return ans.toString();
    }
    StringBuilder count(StringBuilder str){
        StringBuilder ans=new StringBuilder();
        int cnt=1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                cnt++;
            }
            else{
                ans.append(""+cnt+str.charAt(i));
                cnt=1;
            }
        }
        ans.append(""+cnt+str.charAt(str.length()-1));
        return ans;
    }
    
}