class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans=0;
        int j=0;
        for(int i=cost.length-1;i>=0;i--){
            if(j<2){
                ans+=cost[i];
            }
            j++;
            if(j>2) j=0;
        }
        return ans;
    }
}