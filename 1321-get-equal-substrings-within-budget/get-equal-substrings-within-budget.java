class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int[] cnt=new int[s.length()];
        for(int i=0;i<s.length();i++){
            cnt[i]=Math.abs(s.charAt(i)-t.charAt(i));
        }
        int left=0,right=0;
        int sum=0;
        int max=0;
        while(left<t.length()){
            sum+=cnt[left];
            while(sum>maxCost && right<=left){
                sum-=cnt[right];
                right++;
            }
            max=Math.max(max,left-right+1);
            left++;
        }
        return max;
    }
}