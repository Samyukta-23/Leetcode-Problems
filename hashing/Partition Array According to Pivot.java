class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> list=new ArrayList<>();
        boolean flag=false;
        list.add(pivot);
        for(int n:nums){
            if(n==pivot ){
                if(!flag){
                    flag=true;
                    continue;
                }
                list.add(list.indexOf(pivot),n);
            }
            else if(n>pivot){
                list.add(n);
            }
            else{
                list.add(0,n);
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
        return nums;
    }
}
