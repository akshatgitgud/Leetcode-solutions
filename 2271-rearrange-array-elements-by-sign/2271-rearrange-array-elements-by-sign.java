class Solution {
    public int[] rearrangeArray(int[] nums) {
    int n= nums.length;
    int[] ans = new int[n];
    int i=0,j=0,k=0,l=1;
    while(i<n && j<n){
        if(nums[i]>=0){
            ans[k]=nums[i];k+=2;
        }
          if(nums[j]<=0){
            ans[l]=nums[j];l+=2;
        }
        j++;i++;
    }
return ans;
    }
}