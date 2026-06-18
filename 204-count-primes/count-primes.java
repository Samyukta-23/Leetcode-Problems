class Solution {
    public int countPrimes(int n) {
        if(n==0||n==1) return 0;
        boolean[] isPrime=new boolean[n+1];
        int cnt=0;
        for(int i=2;i<n;i++){
            isPrime[i]=true;
        }
        for(int i=2;i*i<n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<n;j=j+i){
                    isPrime[j]=false;
                }
            }
        }
        for(boolean num:isPrime){
            if(num) cnt++;
        }
        return cnt;
    }
}