class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,-1);
        int sum=0,maxlen=0,l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum+=-1;
            }
            else{
                sum+=1;         
            }
            if(h.containsKey(sum)){
                l=i-h.get(sum);
                maxlen=Math.max(maxlen,l);
            }
            else  h.put(sum,i);
        }
        return maxlen;
    }
}