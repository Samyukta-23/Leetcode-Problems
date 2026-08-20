class Solution {
    public int arrangeCoins(int n) {
        long ans=0;
        long low=1,high=n;
        while(low<=high){
            long mid=(high+low)/2;
            if(mid*(mid+1)/2<=(long)n){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return (int)ans;
    }
}