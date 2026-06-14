class Solution {
    public int getLength(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            HashMap<Integer, Integer> mpp = new HashMap<>();
            HashMap<Integer, Integer> mpp1 = new HashMap<>();

            for (int j = i; j < n; j++) {
                int val = nums[j];

                if (mpp.getOrDefault(val, 0) > 0) {
                    int freq = mpp.get(val);

                    mpp1.put(freq, mpp1.get(freq) - 1);

                    if (mpp1.get(freq) == 0) {
                        mpp1.remove(freq);
                    }
                }

                mpp.put(val, mpp.getOrDefault(val, 0) + 1);
                int newFreq = mpp.get(val);

                mpp1.put(newFreq, mpp1.getOrDefault(newFreq, 0) + 1);

                if (mpp.size() == 1 && mpp1.size() == 1) {
                    ans = Math.max(ans, j - i + 1);
                } 
                else if (mpp1.size() == 2) {

                    Iterator<Integer> it = mpp1.keySet().iterator();

                    int f1 = it.next();
                    int f2 = it.next();

                    int maxi = Math.max(f1, f2);
                    int mini = Math.min(f1, f2);

                    if (maxi == 2 * mini) {
                        ans = Math.max(ans, j - i + 1);
                    }
                }
            }
        }

        return ans;
    }
}