class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans=new ArrayList<>();
        helper(candidates,0,0,target,new ArrayList<>());
        return ans;
    }

    void helper(int[] a,int in,int s,int t,List<Integer> l){
        if(s>t) return;
        if(s==t){
            if(!ans.contains(l)){
                ans.add(new ArrayList<>(l));
            }
            return;
        }
        for(int i=in;i<a.length;i++){
            s+=a[i];
            l.add(a[i]);
            if(s<t){
                helper(a,i,s,t,l);
            }
            else{
                helper(a,i+1,s,t,l);
            }
            l.remove(l.size()-1);
            s-=a[i];
        }
    }
}