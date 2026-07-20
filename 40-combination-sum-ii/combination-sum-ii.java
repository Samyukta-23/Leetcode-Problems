class Solution {
    List<List<Integer>> ans;
    boolean[] dp;
    int prev=0;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        dp=new boolean[candidates.length];
        ans=new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,0,new ArrayList<>(),0);
        return ans;
    }

    void helper(int[] arr,int target,int sum,List<Integer> list,int in){
        if(target==sum){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum>target) return;
        for(int i=in;i<arr.length;i++){
            if(i>in && arr[i]==arr[i-1]) continue;
            sum+=arr[i];
            list.add(arr[i]);
            helper(arr,target,sum,list,i+1);
            sum-=arr[i];
            list.remove(list.size()-1);
        }
    }
}