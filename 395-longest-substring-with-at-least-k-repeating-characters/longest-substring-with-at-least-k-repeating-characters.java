class Solution {
    public int longestSubstring(String s, int k) {
        // HasMap<Character,Integer> map=new HashMap<>();
        // int left=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> map=new HashMap<>();
            for(int j=i;j<s.length();j++){
                
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                if(j-i+1<ans){
                    continue;
                }
                boolean flag=false;
                for(char key:map.keySet()){
                    if(map.get(key)<k){
                        flag=true;
                        break;
                    }
                }
                if(!flag){
                    ans=Math.max(ans,j-i+1);
                }
            } 
        }
        return ans;
    }
}