class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        int swap=-1;
        if(nums.length>1){
            for(int i=nums.length-1;i>0;i--){
                if(nums[i]>nums[i-1]){
                    ind=i-1;
                    break;
                }
            }

            // System.out.println("ind :"+ind);

            if(ind==-1){
               for(int i=ind+1;i<nums.length/2;i++){
                    int t=nums[i];
                    nums[i]=nums[nums.length-1-i];
                    nums[nums.length-i-1]=t;
                }
                return;
            }
            for(int i=ind+1;i<nums.length;i++){
                if(nums[i]>nums[ind]){
                    if(swap==-1)
                    swap=i;
                    else{
                        if(nums[i]<=nums[swap]) swap=i;
                    }
                }
            }
            // System.out.println("Swap :"+swap);
            int temp=nums[ind];
            nums[ind]=nums[swap];
            nums[swap]=temp;

            int[] arr=new int[nums.length-ind-1];
            int k=0;
            for(int i=nums.length-1;i>ind;i--){
                arr[k++]=nums[i];
            }
            k=0;
            for(int i=ind+1;i<nums.length;i++){
                nums[i]=arr[k++];
            }
        }
        
    }
}