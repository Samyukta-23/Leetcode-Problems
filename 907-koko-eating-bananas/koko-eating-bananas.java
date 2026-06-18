class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int n:piles){
            max=Math.max(n,max);
        }
        int low=1,high=max;
        while(low<high){
            int mid=(low+high)/2;
            if(isPossible(piles,h,mid)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    boolean isPossible(int[] arr,int h,int hour){
        long sum=0;
        for(int n:arr){
            sum+=(long)Math.ceil((double)n/hour);
        }
        return sum<=(long)h;
    }
}