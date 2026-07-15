class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list=new ArrayList<>();
        if(nums.length==0) return list;
        if(nums.length==1){
            list.add(""+nums[0]+"");
            return list;
        }

        int first=nums[0];
        int fi=0;
        int cnt=0;
        for(int i=1;i<nums.length;i++){
            if(first+1==nums[i]){
                first=nums[i];
                fi=i;
                cnt++;
                continue;
            }
            else{
                if(cnt==0){
                    list.add(""+nums[i-1]+"");
                    
                }
                else
                list.add(nums[fi-cnt]+"->"+nums[i-1]);
                cnt=0;
                first=nums[i];
            }
        }
        if(cnt==0){
            list.add(""+nums[nums.length-1]+"");

        }
        else{
            list.add(nums[fi-cnt]+"->"+nums[nums.length-1]);
        }
        System.out.print(cnt+" FIR"+fi);
        return list;
    }
}