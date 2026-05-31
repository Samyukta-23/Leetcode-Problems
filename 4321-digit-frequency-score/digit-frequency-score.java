class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        long ans=0;
        while(n!=0){
            int digit=n%10;
            map.put(digit,map.getOrDefault(digit,0)+1);
            n/=10;
        }
        for(int k:map.keySet()){
        //    System.out.println(map.get(k)+" "+k);
            ans+=(map.get(k)*(k));
        }
        return (int)ans;
    }
}