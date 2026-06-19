class Solution {
    public int myAtoi(String s) {
        int i=0;
        int sign=1;
        int sum=0;
        while(i<s.length() && s.charAt(i)==' ') i++;
        if(i<s.length() && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            if(s.charAt(i)=='-') sign=-1;
            i++;
        }
        return helper(s,i,sum,sign);
    }

    int helper(String str,int i,long res,int sign){
        if(i>=str.length() || (str.charAt(i)>'9' || str.charAt(i)<'0')){
            return (int)(sign*res);
        }
        res=res*10+(str.charAt(i)-'0');
        if(res*sign<=-2147483648) return -2147483648;
        if(res*sign>=2147483647) return 2147483647;
        return helper(str,i+1,res,sign);
    }
}