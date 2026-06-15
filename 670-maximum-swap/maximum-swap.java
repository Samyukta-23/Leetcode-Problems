class Solution {
    public int maximumSwap(int num) {
        char[] str=Integer.toString(num).toCharArray();
        for(int i=0;i<str.length;i++){
            int max=str[i]-'0';
            int ind=i;
            boolean change=false;
            for(int j=i+1;j<str.length;j++){
                if(str[j]-'0'>=max){
                    max=str[j]-'0';
                    ind=j;
                    change=true;
                }
            }
            if(change && str[i]!=str[ind]){
                char temp=str[ind];
                str[ind]=str[i];
                str[i]=temp;
                break;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(char ch:str){
            ans.append(ch);
        }
        String res=ans.toString();
        int a=Integer.valueOf(res);
        return a;
    }
}