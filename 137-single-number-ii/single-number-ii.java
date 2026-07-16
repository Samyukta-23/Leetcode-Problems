class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> f=new HashMap<>();
        for(int n:nums){
            f.put(n,f.getOrDefault(n,0)+1);
        }
        for(int key:f.keySet()){
            if(f.get(key)==1) return key;
        }
        return -1;
    }
}