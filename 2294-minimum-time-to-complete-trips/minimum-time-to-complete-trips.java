class Solution {
    public long minimumTime(int[] time, int t) {
        long max=time[0];
        for(int num:time){
            max=Math.max(max,num);
        }

        long low=1,high=(long)(max*t);
        while(low<high){
            long mid=(high+low)/2;
            if(possible(mid,time,t)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    public boolean possible(long n,int[] arr,int t){
        long sum=0;
        for(int num:arr){
            sum+=(long)(n/num);
        }
        return sum>=t;
    }
}