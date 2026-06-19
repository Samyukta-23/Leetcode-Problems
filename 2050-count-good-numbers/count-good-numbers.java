class Solution {
    long mod=1000000007;
    public int countGoodNumbers(long n) {
        long even=(n+1)/2,odd=(n)/2;
        long even_ans=helper(5,even);
        long odd_ans=helper(4,odd);
        return (int)((even_ans%mod)*(odd_ans%mod)%mod);
    }

    long helper(long x,long n){
        if(n==0) return 1;
        long temp=helper(x,n/2);
        if(n%2==0) return (temp*temp)%mod;
        else return (x*temp*temp) % mod;
    }
}