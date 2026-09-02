class Solution {
    public int[] productExceptSelf(int[] nums) {
         int n = nums.length;
        int[] ans = new int[n];
        int product = 1;
        for (int i : nums) {
            product = product * i;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                ans[i] = product / nums[i];
            } else {
                int alt = 1;
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        alt = alt * nums[j];
                    }
                    else continue;
                }
                ans[i] = alt;
            }
        }
        // System.out.println(Arrays.toString(ans));
        return ans;
    }
}