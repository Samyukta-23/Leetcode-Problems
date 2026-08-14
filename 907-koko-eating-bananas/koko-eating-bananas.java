class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int num:piles){
            max=Math.max(num,max);
        }
        int ans=-1;
        int low=1,high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(mid,piles,h)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return high+1;
    }

    boolean possible(int n,int[] piles,int h){
        long sum=0;
        for(int pile:piles){
            sum+=(pile/n);
            if(pile%n!=0) sum++;
        }
        return sum<=(long)h;
    }
}