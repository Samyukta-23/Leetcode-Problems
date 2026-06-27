// class Solution {
//     public boolean predictTheWinner(int[] nums) {
//         ArrayList<Integer> list=new ArrayList<>();
//         for(int num:nums){
//             list.add(num);
//         }
//         return helper(0,0,list);
//     }

//     boolean helper(int p1,int p2,ArrayList<Integer> list){
//         if(list.size()==0){
//             return p1>p2;
//         }
//         int temp1=list.get(0);
//         p1+=list.get(0);
//         list.remove(list.get(0));
//         if(list.size()==0){
//             return p1>p2;
//         }
//         int temp2=list.get(0);
//         p2+=Math.max(list.get(0),list.get(list.size()-1));
//         if(list.get(0)>list.get(list.size()-1)){
//             list.remove(0);
//         }
//         else{
//             temp2=list.get(list.size()-1);
//             list.remove(list.size()-1);
//         }
//         boolean take1= helper(p1,p2,list);
//         list.add(0,temp1);
//         list.add(temp2);
//         p1-=temp1;
//         p2-=temp2;
//         p1+=list.get(list.size()-1);
//         list.remove(list.size()-1);
//         if(list.size()==0){
//             return p1>p2;
//         }
//         p2+=Math.max(list.get(0),list.get(list.size()-1));
//         if(list.get(0)>list.get(list.size()-1)){
//             list.remove(0);
//         }
//         else{
//             list.remove(list.size()-1);
//         }
//         boolean take2=helper(p1,p2,list);
//         return take1 || take2;
//     }
// }

class Solution {

    public boolean predictTheWinner(int[] nums) {
        return helper(nums, 0, nums.length - 1, 0, 0, true);
    }

    boolean helper(int[] nums, int left, int right,
                   int p1, int p2, boolean turn) {

        if (left > right)
            return p1 >= p2;

        if (turn) {
            // Player 1's turn
            boolean takeLeft =
                    helper(nums, left + 1, right,
                           p1 + nums[left], p2, false);

            boolean takeRight =
                    helper(nums, left, right - 1,
                           p1 + nums[right], p2, false);

            return takeLeft || takeRight;
        } else {
            // Player 2's turn
            boolean takeLeft =
                    helper(nums, left + 1, right,
                           p1, p2 + nums[left], true);

            boolean takeRight =
                    helper(nums, left, right - 1,
                           p1, p2 + nums[right], true);

            return takeLeft && takeRight;
        }
    }
}