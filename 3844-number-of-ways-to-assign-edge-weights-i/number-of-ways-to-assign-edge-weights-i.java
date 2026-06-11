class Solution {
    int max_depth=0;
    long MOD = 1000000007L;
    public int assignEdgeWeights(int[][] edges) {
        HashMap<Integer,ArrayList<Integer>> map= new HashMap<>();
        for(int i=0;i<=edges.length+1;i++){
            map.put(i,new ArrayList<>());
        }

        for(int[] arr:edges){
            map.get(arr[0]).add(arr[1]);
            map.get(arr[1]).add(arr[0]);
        }
        boolean[] vis=new boolean[edges.length+2];
        vis[1]=true;
        traversal(1,0,vis,map);
        return (int) format(2,max_depth-1);
    }

    void traversal(int node, int depth, boolean[] vis, HashMap<Integer,ArrayList<Integer>> map){
        vis[node]=true;
        max_depth=Math.max(max_depth,depth);
        for(int nei:map.get(node)){
            if(!vis[nei]){
                traversal(nei,depth+1,vis,map);
            }
        }
    }

    long format(long base,long pow){
        long ans=1;
        for(int i=1;i<=pow;i++){
            ans*=base;
            if(ans>=1000000007){
                ans%=1000000007;
            }
        }
        return ans;
    }
}