class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int[] arr:items1){
            map.put(arr[0],arr[1]);
        }
        for(int[] arr:items2){
            map.put(arr[0],map.getOrDefault(arr[0],0)+arr[1]);
        }
        int[][] res=new int[map.size()][2];
        int k=0;
        for(int key:map.keySet()){
            res[k][0]=key;
            res[k][1]=map.get(key);
            k++;
        }
        Arrays.sort(res,(a,b)->Integer.compare(a[0],b[0]));
        List<List<Integer>> list=new ArrayList<>();
        for(int[] arr:res){
            List<Integer> nums=new ArrayList<>();
            nums.add(arr[0]);
            nums.add(arr[1]);
            list.add(nums);
        }

        return list;
    }
}