class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder ans=new StringBuilder();
        for(char ch='1';ch<='9' && ans.length()<=pattern.length();ch++){
            ans.append(ch);
        }
        int i=1,j=0;
        int k=0;
        while(i<=ans.length()-1){
            if(pattern.charAt(k)=='I'){
                i++;
                j=i-1;
            }
            else{
                char temp=ans.charAt(i);
                ans.deleteCharAt(i);
                ans.insert(j,temp);
                i++;
            }
            k++;
        }
        return ans.toString();
    }
}