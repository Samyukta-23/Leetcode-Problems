class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        ans=new ArrayList<>();
        if(n<k) return ans;
        helper(arr,k,n,new ArrayList<>(),0,0);
        return ans;
    }

    void helper(int arr[],int size,int target,List<Integer> list,int in,int sum){
        if(list.size()==size && sum==target){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(list.size()>size) return;
        for(int i=in;i<9;i++){
            sum+=arr[i];
            list.add(arr[i]);
            helper(arr,size,target,list,i+1,sum);
            list.remove(list.size()-1);
            sum-=arr[i];
        }
    }
}