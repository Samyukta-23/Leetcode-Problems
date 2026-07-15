class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combine(int n, int k) {
        ans=new ArrayList<>();
        int[] arr=new int[n];
        for(int i=1;i<=n;i++){
            arr[i-1]=i;
        }
        f(arr,new ArrayList<>(),k,0);
        return ans;
    }

    void f(int[] a,ArrayList<Integer> l,int k,int ind){
        if(l.size()==k ){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=ind;i<a.length;i++){
            if(l.contains(a[i])) continue;
            l.add(a[i]);
            f(a,l,k,i+1);
            l.remove(l.size()-1);
        }
    }
}