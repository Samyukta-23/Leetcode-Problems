// class Solution {
//     public int jump(int[] nums) {
//         int ans = 0;
//         int farthest = 0;
//         int currentEnd = 0;
//         for (int i = 0; i < nums.length - 1; i++) {
//             farthest = Math.max(farthest, i + nums[i]);
//             if (i == currentEnd) {
//                 ans++;
//                 currentEnd = farthest;
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public int jump(int[] arr) {
        if(arr.length==1) return 0;
        int ans=0;
        int i=0;
        while(i<arr.length){
            int far=arr[i]+i;
            if(far>=arr.length-1){
                ans++;
                break;
            } 
            int next=i+1;
            int max=arr[next]+next;
            for(int k=next;k<=far;k++){
                if(arr[k]+k>=max){
                    next=k;
                    max=arr[k]+k;
                }
            }
            ans++;
            i=next;
        }
        return ans;
    }
}