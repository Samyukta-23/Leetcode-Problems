class Solution {
    int ans;
    public int countArrangement(int n) {
        ans=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        return helper(arr,new ArrayList<>());
    }

    int helper(int[] arr,ArrayList<Integer> list){
        if(list.size()==arr.length){
            return 1;
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(list.contains(arr[i])) continue;
            list.add(arr[i]);
            if((list.size())%arr[i]==0 || arr[i]%(list.size())==0)
            ans+= helper(arr,list);
            list.remove(list.size()-1);
        }
        return ans;
    }
}