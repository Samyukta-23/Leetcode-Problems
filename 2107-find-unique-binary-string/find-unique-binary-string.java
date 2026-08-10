class Solution {
    public String findDifferentBinaryString(String[] nums) {
        List<String> list=new ArrayList<>();
        int len=nums[0].length();
        helper(0,len,new StringBuilder(),list);
        for(String str:list){
            boolean f=true;
            for(int i=0;i<nums.length;i++){
                if(nums[i].equals(str)){
                    f=false;
                    break;
                }
            }
            if(f) return str;
        }

        return "";
    }
    void helper(int in,int len,StringBuilder str,List<String> list){
        if(len==str.length()){
            list.add(new String(str));
            return;
        }
            str.append("0");
            helper(in,len,str,list);
            str.deleteCharAt(str.length()-1);
            in=1;
            str.append("1");
            helper(in,len,str,list);
            str.deleteCharAt(str.length()-1);
            in=0;
    }
}