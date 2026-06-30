class Solution {
    public int numberOfSubstrings(String s) {
        int cnt=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int e=0;
        int i=0;
        while(i<s.length()){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.size()==3){
                cnt+=s.length()-i;
                char left=s.charAt(e);

                map.put(left,map.get(left)-1);
                if(map.get(left)==0) map.remove(s.charAt(e));
                e++;
            }
             i++;
        }
        return cnt;
    }
}