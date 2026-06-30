class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        ArrayList<int[]> list=new ArrayList<>();
        for(int[] arr:intervals){
            if(list.size()==0){
                list.add(arr);
            }
            else if(list.get(list.size()-1)[1]<arr[0]){
                list.add(arr);
            }
            else if(list.get(list.size()-1)[1]>=arr[0] && list.get(list.size()-1)[1]>=arr[1]){
                continue;
            }
            else{
                list.get(list.size()-1)[1]=arr[1];
            }
        }
        int ans[][] =new int[list.size()][2];
        int k=0;
        for(int[] arr:list){
            ans[k][0] = list.get(k)[0];
            ans[k][1]=list.get(k)[1];
            k++;
        }
        return ans;
    }
    
}